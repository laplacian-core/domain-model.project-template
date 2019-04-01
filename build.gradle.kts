import laplacian.gradle.task.LaplacianGenerateExtension
group = "laplacian"
version = "1.0.0"
plugins {
    `maven-publish`
    kotlin("jvm") version "1.3.10"
    id("laplacian.plugin.metamodel") version "1.0.0"
}
repositories {
    maven(url = "../mvn-repo/")
    maven(url = "https://raw.github.com/nabla-squared/mvn-repo/maven/")
    jcenter()
}
dependencies {
    model("laplacian:laplacian.model.metamodel:1.0.0")
}
configure<LaplacianGenerateExtension> {
    template {
        from("src/main/resources")
    }
}
publishing {
    repositories {
        maven(url = "../mvn-repo/")
    }
    publications.create("mavenJava", MavenPublication::class.java) {
        from(components["java"])
    }
}