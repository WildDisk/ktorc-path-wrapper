plugins {
    kotlin("jvm")
    id("maven-publish")
}

group = "ru.wilddisk"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(Ktor.client.core)
    testImplementation(kotlin("test"))
    testImplementation(Ktor.client.mock)
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "ru.wilddisk"
            artifactId = "ktorc-path-wrapper"
            version = "1.0.0"

            from(components["java"])
        }
    }
}