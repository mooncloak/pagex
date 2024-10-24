plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
    maven("https://repo.repsy.io/mvn/mooncloak/public")
}

dependencies {
    implementation(Kotlin.stdlib)
    implementation(Kotlin.gradlePlugin)

    implementation("com.mooncloak.kodetools.kenv:kenv-core:_")
}

gradlePlugin {
    plugins.register("pagex.variables") {
        id = "pagex.variables"
        implementationClass = "BuildVariablesPlugin"
    }
}
