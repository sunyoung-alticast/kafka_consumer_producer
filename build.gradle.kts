import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("org.springframework.boot") version "2.6.3-SNAPSHOT"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
}

group = "com.msp"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("junit:junit:4.12")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.springframework.kafka:spring-kafka")
	implementation("org.apache.httpcomponents:httpclient:4.5.11")
	implementation("com.google.code.gson:gson")
	implementation("io.github.microutils:kotlin-logging:1.7.6")
}



tasks.withType<Test> {
	useJUnitPlatform()
}
