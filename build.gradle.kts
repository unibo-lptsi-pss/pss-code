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

val mainClass: String by project 

application {
    mainClass.set(project.properties["mainClass"].toString())
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
