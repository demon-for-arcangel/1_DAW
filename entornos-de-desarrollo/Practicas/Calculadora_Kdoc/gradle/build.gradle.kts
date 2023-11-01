plugins {
    kotlin("jvm") version "1.8.20"
    application
}
/*
plugins {
    kotlin("jvm") version "1.7.20"
    application
    id("org.jetbrains.dokka") version "1.7.20"
}*/

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}