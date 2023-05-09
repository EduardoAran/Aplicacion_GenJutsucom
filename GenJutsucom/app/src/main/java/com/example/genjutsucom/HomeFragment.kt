package com.example.genjutsucom

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.genjutsucom.databinding.FragmentAbecedarioBinding
import com.example.genjutsucom.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        binding.quizButton.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), QuizActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

}