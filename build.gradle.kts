plugins {
    java
    id("com.github.mrsarm.jshell.plugin") version("1.2.0") // ./gradlew --console plain jshell
    application // -PmainClass=it.unibo.lifecycle.MandelbrotApp runMain
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
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitPlatformVersion")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
		events("passed", "skipped", "failed")
	}
    testLogging.showStandardStreams = true
}
// ./gradlew tests --rerun-tasks --tests SomeTestClass*