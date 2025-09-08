import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    id("com.github.mrsarm.jshell.plugin") version("1.2.0") // ./gradlew --console plain jshell
    application // -PmainClass=it.unibo.lifecycle.MandelbrotApp run
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

val junitPlatformVersion = "5.9.1"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitPlatformVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitPlatformVersion") // needed for @ParameterizedTest
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitPlatformVersion")
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