package co.ghostnotes.sample.dagger2.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class ActivityUtils {

    fun addFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment, frameId: Int) {
        fragmentManager.beginTransaction().apply {
            add(frameId, fragment)
            commit()
        }
    }

}