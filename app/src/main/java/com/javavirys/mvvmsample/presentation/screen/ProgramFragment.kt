package com.javavirys.mvvmsample.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.di.viewmodel.ProgramViewModelFactory
import com.javavirys.mvvmsample.presentation.adapter.ProgramAdapter
import com.javavirys.mvvmsample.presentation.navigation.Router
import com.javavirys.mvvmsample.presentation.viewmodel.ProgramViewModel

class ProgramFragment : Fragment(R.layout.fragment_program) {

    private val router by lazy {
        Router(requireActivity() as AppCompatActivity, R.id.fragmentContainer)
    }

    private val actionBar by lazy { (requireActivity() as AppCompatActivity).supportActionBar }

    private val model: ProgramViewModel by viewModels { ProgramViewModelFactory(router) }

    private val adapter: ProgramAdapter by lazy { ProgramAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewCompat.requireViewById<RecyclerView>(view, R.id.programRecyclerView).also {
            it.adapter = adapter
        }
        model.getPrograms().observe(viewLifecycleOwner, adapter::setItems)

        requireArguments().getInt(CHANNEL_ID).let(model::loadPrograms)
    }

    override fun onResume() {
        super.onResume()
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {

        private const val CHANNEL_ID = "CHANNEL_ID"

        fun newInstance(channelId: Int) = ProgramFragment().also {
            it.arguments = bundleOf(CHANNEL_ID to channelId)
        }
    }
}