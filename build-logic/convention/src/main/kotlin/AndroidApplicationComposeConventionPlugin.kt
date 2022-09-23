/**
 *
 * Created on 2022/09/23.
 *
 * Description:
 *
 * @author wooyj
 * @since 3.1.4
 */
/**
 *
 * Created on 2022/09/19.
 *
 * Description:
 *
 * @author wooyj
 *
 */

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.wooyj.gardenmanager.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            val extension = extensions.getByType<BaseAppModuleExtension>()
            configureAndroidCompose(extension)
        }
    }
}