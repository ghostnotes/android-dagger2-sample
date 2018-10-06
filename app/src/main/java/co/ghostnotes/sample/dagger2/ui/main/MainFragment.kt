package co.ghostnotes.sample.dagger2.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import co.ghostnotes.sample.dagger2.R
import co.ghostnotes.sample.dagger2.di.ActivityScoped
import co.ghostnotes.sample.dagger2.util.MessageHelper
import dagger.android.support.DaggerFragment
import javax.inject.Inject

@ActivityScoped
class MainFragment @Inject constructor() : DaggerFragment() {

    @Inject
    lateinit var messageHelper: MessageHelper

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.findViewById<TextView>(R.id.message_text).text = messageHelper.getMessage()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
