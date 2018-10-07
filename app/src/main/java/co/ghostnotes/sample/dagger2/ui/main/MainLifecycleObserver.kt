package co.ghostnotes.sample.dagger2.ui.main

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import co.ghostnotes.sample.dagger2.util.MessageHelper

internal class MainLifecycleObserver(
        private val view: MainContract.View,
        private val messageHelper: MessageHelper
): LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        view.setText(messageHelper.getMessage())
    }

}