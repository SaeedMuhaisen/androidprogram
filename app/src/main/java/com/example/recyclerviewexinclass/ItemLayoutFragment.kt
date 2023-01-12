package com.example.recyclerviewexinclass

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.recyclerviewexinclass.R
import com.example.recyclerviewexinclass.databinding.FragmentLoginpageBinding

class ItemLayoutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginpageBinding>(inflater, R.layout.item_layout, container, false)
        return binding.root
    }



}
