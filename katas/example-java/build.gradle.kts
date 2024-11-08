plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.serialization)
//    alias(libs.plugins.spotless)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.bundles.unit.tests)
    testImplementation(libs.bundles.tests)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}

//spotless {
//    kotlin {
//        ktlint(libs.versions.klint.get()).editorConfigOverride(
//            mapOf(
//                "standard:max-line-length" to "160",
//                "ktlint_standard_no-wildcard-imports" to "disabled",
//            ),
//        )
//        target(
//            "*/java/**/*.java",
//            "src/*/java/**/*.java",
//        )
//        targetExclude(
//            "*/resources/**/*.java",
//            "src/*/resources/**/*.java",
//            "**/build/**",
//            "**/.gradle/**",
//        )
//    }
//    kotlinGradle {
//        ktlint(libs.versions.klint.get()).editorConfigOverride(
//            mapOf(
//                "max_line_length" to "160",
//            ),
//        )
//    }
//}
