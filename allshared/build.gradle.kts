plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("co.touchlab.faktory.kmmbridge") version "0.2.0"
}

kotlin {

    iosArm64()
    iosSimulatorArm64()
    iosX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":moduleA"))
                implementation(project(":moduleB"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

    cocoapods {
        summary = "Kevs KMM Test"
        homepage = "https://touchlab.dev"

        ios.deploymentTarget = "13"

        specRepos {
            url("git@github.com:kpgalligan/KMMPodSpecs.git")
        }
    }
}

kmmbridge {
    githubReleaseArtifacts()
    timestampVersions()
    versionPrefix.set("0.4")
    spm("..")
}

configurations.all {
    resolutionStrategy.cacheChangingModulesFor(0, "seconds") //cacheChangingModulesFor 0, 'seconds'
}