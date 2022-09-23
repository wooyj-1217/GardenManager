plugins {
    `kotlin-dsl`
}

group = "com.wooyj.gardenmanager.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    //  [compileOnly]
    //  compile 시에만 빌드하고 빌드 결과물에는 포함하지 않음
    //  runtime 시 필요없는 라이브러리인 경우 (runtime 환경에 이미 라이브러리가 제공되고 있는가 하는 등의 경우)
    //  compile 시에만 빌드하고 빌드 결과물에는 포함하지 않음
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.spotless.gradlePlugin)
}

gradlePlugin {
    plugins {
        //  compose application 관련
        register("androidApplicationCompose") {
            id = "gardenmanager.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        //  android application 관련
        register("androidApplication") {
            id = "gardenmanager.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}