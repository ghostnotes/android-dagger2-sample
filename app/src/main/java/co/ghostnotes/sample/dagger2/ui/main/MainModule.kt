package co.ghostnotes.sample.dagger2.ui.main

import co.ghostnotes.sample.dagger2.di.FragmentScoped
import co.ghostnotes.sample.dagger2.util.ActivityUtils
import co.ghostnotes.sample.dagger2.util.MessageHelper
import co.ghostnotes.sample.dagger2.util.TextHelper
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideActivityUtils() = ActivityUtils()

        @JvmStatic
        @Provides
        fun provideTextHelper() = TextHelper()

        @JvmStatic
        @Provides
        fun provideMessageHelper() = MessageHelper()
    }

}