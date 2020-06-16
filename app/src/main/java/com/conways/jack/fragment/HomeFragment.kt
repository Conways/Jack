package com.conways.jack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.conways.jack.R
import com.conways.jack.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.fragmentHomeBt.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }

        return binding.root;
    }


    fun clickEvent(view: View) {
//        HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        Toast.makeText(activity, "actionHomeFragmentToDetailFragment", Toast.LENGTH_SHORT).show();


    }

}

