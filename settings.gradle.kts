rootProject.name = "KevsKmmTest"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

include(":moduleA", ":moduleB", ":allshared")
