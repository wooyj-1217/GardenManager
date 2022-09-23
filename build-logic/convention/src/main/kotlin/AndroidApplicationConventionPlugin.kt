
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.wooyj.gardenmanager.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure



/**
 *
 * android application에 적용될 plugin.
 *
 * @author wooyj
 *
 * @param param명 설명입력
 *
 */
class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<BaseAppModuleExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 33
            }
        }
    }

}