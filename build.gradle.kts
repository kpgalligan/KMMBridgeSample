plugins {
    kotlin("multiplatform") version "1.7.10" apply false
}

allprojects {
    group = "co.touchlab.multirepodemo"
    version = "0.0.2"

    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

configurations.all {
    resolutionStrategy.cacheChangingModulesFor(0, "seconds") //cacheChangingModulesFor 0, 'seconds'
}