buildscript {
//    ext {
//        compose_version = '1.1.0-beta01'
//    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    id 'com.android.application' version '7.2.2' apply false
//    id 'com.android.library' version '7.2.2' apply false
//    id 'org.jetbrains.kotlin.android' version '1.7.10' apply false
//    id 'org.jetbrains.kotlin.jvm' version '1.7.10' apply false
//    id 'com.android.dynamic-feature' version '7.2.2' apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.secrets) apply false
    alias(libs.plugins.spotless) apply false
//    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
//    id("com.android.library") version "7.2.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
//    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}