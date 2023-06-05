plugins {
	id("groovy")
}

group = "com.konkuk"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.codehaus.groovy:groovy-all:3.0.16")
}

subprojects {
	group = "com.konkuk"
	version = "0.0.1-SNAPSHOT"

	tasks.register("prepareKotlinBuildScriptModel"){}
}
