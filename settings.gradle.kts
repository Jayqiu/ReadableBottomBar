pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven{setUrl("https://www.jitpack.io")}
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{setUrl("https://www.jitpack.io")}
        maven { setUrl("https://repo1.maven.org/maven2/") }
    }
}
rootProject.name = "ReadableBottomBar"
include(":app")
include(":library")

