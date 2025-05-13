plugins {
    id("java")
}

group = "RDA6666"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(
        "com.codeborne:selenide:6.11.2",
        "org.junit.jupiter:junit-jupiter:5.9.2"
    )
}

tasks.test {
    useJUnitPlatform()
}