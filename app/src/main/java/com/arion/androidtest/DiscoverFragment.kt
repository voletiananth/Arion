package com.arion.androidtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.arion.androidtest.databinding.FragmentDiscoverBinding
import com.arion.androidtest.utils.DiscoverRvAdapter

class DiscoverFragment:Fragment(){

    private lateinit var binding:FragmentDiscoverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiscoverBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.content){
            val layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
            recycleView.layoutManager = layoutManager
            recycleView.adapter = DiscoverRvAdapter()
        }
    }
}