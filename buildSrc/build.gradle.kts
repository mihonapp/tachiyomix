plugins {
    `kotlin-dsl`
}

fun plugin(plugin: Provider<PluginDependency>) = plugin.map {
    "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}"
}

dependencies {
    // Expose the version catalog to precompiled script plugins
    compileOnly(files(libs::class.java.superclass.protectionDomain.codeSource.location))

    implementation(plugin(libs.plugins.android.library))
    implementation(plugin(libs.plugins.kotlin.android))
    implementation(plugin(libs.plugins.spotless))
    implementation(plugin(libs.plugins.tapmoc))
}
