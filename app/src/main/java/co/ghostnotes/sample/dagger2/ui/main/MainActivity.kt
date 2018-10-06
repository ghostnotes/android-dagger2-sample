package co.ghostnotes.sample.dagger2.ui.main

import android.os.Bundle
import android.util.Log
import co.ghostnotes.sample.dagger2.R
import co.ghostnotes.sample.dagger2.util.ActivityUtils
import co.ghostnotes.sample.dagger2.util.TextHelper
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainContract.View {

    @Inject
    lateinit var textHelper: TextHelper
    @Inject
    lateinit var activityUtils: ActivityUtils

    @Inject
    lateinit var mainFragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            activityUtils.addFragmentToActivity(supportFragmentManager, mainFragment, R.id.container)
        }

        Log.d(TAG, "### ${textHelper.getTestText()}")
    }

    companion object {

        private val TAG = MainActivity::class.java.simpleName

    }

}
