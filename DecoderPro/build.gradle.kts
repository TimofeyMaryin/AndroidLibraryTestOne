import io.grpc.internal.SharedResourceHolder.release

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")

    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                artifact("$buildDir/outputs/aar/${artifactId}-release.aar")
                groupId = "com.github.TimofeyMaryin"
                artifactId = "custom-decoder-lib"
                version = "1.0"
            }
        }
    }
}

//publishing {
//    publications {
//        create<MavenPublication>("maven") {
//            artifact("$buildDir/outputs/aar/${artifactId}-release.aar")
//        }
//    }
//    repositories {
//        maven {
//            url = uri("https://maven.pkg.github.com/TimofeyMaryin/FirstCustomLib")
//            credentials {
//                username = "<ваш_логин>"
//                password = "<ваш_токен_доступа>"
//            }
//        }
//    }
//}
