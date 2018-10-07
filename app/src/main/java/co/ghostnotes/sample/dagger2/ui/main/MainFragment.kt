package co.ghostnotes.sample.dagger2.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.ghostnotes.sample.dagger2.R
import co.ghostnotes.sample.dagger2.di.ActivityScoped
import co.ghostnotes.sample.dagger2.util.MessageHelper
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

@ActivityScoped
class MainFragment @Inject constructor() : DaggerFragment(), MainContract.View {

    @Inject
    lateinit var messageHelper: MessageHelper

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(MainLifecycleObserver(this, messageHelper))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun setText(text: String) {
        message_text.text = text
    }

}
