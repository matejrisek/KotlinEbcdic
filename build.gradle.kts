import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
    `maven-publish`
}

group = "com.quarksplitter.ebcdic"
version = "1.0-SNAPSHOT"

val junitVersion = "5.4.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testImplementation("org.assertj:assertj-core:3.12.2")
    testImplementation("org.apache.commons:commons-lang3:3.9")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.quarksplitter.ebcdic"
            artifactId = "KotlinEbcdic"
            version = "0.0.1-SNAPSHOT"

            from(components["java"])
        }
    }
}