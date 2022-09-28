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

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
		events("passed", "skipped", "failed")
	}
}