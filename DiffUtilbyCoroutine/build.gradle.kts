// Top-level build file where you can add configuration options common to all sub-projects/modules.
apply(plugin = "org.jlleitschuh.gradle.ktlint")
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint_version}")
        classpath(ClassPathPlugins.googleService)
        classpath(ClassPathPlugins.hilt)
        classpath(ClassPathPlugins.navigationArgs)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://jitpack.io")
        }
        // KakaoSDK
        maven {
            setUrl("https://devrepo.kakao.com/nexus/content/groups/public/")
        }
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint") // Version should be inherited from parent

    // Optionally configure plugin
    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        debug.set(true)
        android.set(true)
        outputToConsole.set(true)
        outputColorName.set("RED")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
