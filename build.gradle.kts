plugins {
    java
    id("com.github.mrsarm.jshell.plugin") version("1.2.0") // ./gradlew --console plain jshell
    application // -PmainClass=it.unibo.lifecycle.MandelbrotApp runMain
}

application {
    mainClass.set("it.unibo.lifecycle.MandelbrotApp")
}