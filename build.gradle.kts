import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    id("com.github.mrsarm.jshell.plugin") version("1.2.0") // ./gradlew --console plain jshell
    application // -PmainClass=it.unibo.lifecycle.MandelbrotApp run
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

sourceSets {
    main {
        java {
            srcDir("sources")
        }
    }
}

repositories {
    mavenCentral()
}

val mainClass: String by project 

application {
    mainClass.set(project.properties["mainClass"].toString())
}

val junitPlatformVersion = "6.0.1"

dependencies {
    testImplementation(platform("org.junit:junit-bom:$junitPlatformVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params") // needed for @ParameterizedTest
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
		events(*(TestLogEvent.values())) // events("passed", "skipped", "failed")
	}
    testLogging.showStandardStreams = true
}
// For main preview
tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<Test> {
    jvmArgs("--enable-preview")
}

tasks.withType<JavaExec> {
    jvmArgs = listOf("--enable-preview")
}
// ./gradlew tests --rerun-tasks --tests SomeTestClass*