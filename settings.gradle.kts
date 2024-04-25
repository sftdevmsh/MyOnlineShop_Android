pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //
        //https://github.com/denzcoskun/ImageSlideshow
        //maven { url 'https://jitpack.io' }
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "MyOnlineShop"
include(":app")
 