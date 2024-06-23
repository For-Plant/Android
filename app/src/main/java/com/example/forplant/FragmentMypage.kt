package com.example.forplant

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.forplant.databinding.FragmentCameraBinding
import com.example.forplant.databinding.FragmentHomeBinding
import com.example.forplant.databinding.FragmentMessageBinding
import com.example.forplant.databinding.FragmentMypageBinding


class FragmentMypage: Fragment() {
    private lateinit var binding: FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater, container, false)

        return binding.root
    }
}