plugins {
    `kotlin-dsl`
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}
