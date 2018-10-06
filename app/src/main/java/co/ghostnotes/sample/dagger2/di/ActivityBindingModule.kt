package co.ghostnotes.sample.dagger2.di

import co.ghostnotes.sample.dagger2.ui.main.MainActivity
import co.ghostnotes.sample.dagger2.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

}