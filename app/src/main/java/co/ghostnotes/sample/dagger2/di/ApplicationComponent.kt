package co.ghostnotes.sample.dagger2.di

import android.app.Application
import co.ghostnotes.sample.dagger2.Dagger2SampleApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ActivityBindingModule::class,
    AndroidSupportInjectionModule::class
])
interface ApplicationComponent: AndroidInjector<Dagger2SampleApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

}