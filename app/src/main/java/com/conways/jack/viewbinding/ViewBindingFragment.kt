package com.conways.jack.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.conways.jack.R
import com.conways.jack.databinding.FragmentViewBindingBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ViewBindingFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null


    private var viewBinding: FragmentViewBindingBinding? = null;

    private val binding get() = viewBinding!!;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentViewBindingBinding.inflate(inflater, container, false);
        binding.fargmentViewBindingTest.text="just run !"
        return binding.root;
    }

    override fun onDestroy() {
        super.onDestroy()
        viewBinding = null;
    }


    open fun set(msg: String) {
        binding.fargmentViewBindingTest.text = msg
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ViewBindingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
