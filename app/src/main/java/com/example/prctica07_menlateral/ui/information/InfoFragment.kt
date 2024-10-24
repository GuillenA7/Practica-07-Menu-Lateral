package com.example.prctica07_menlateral.ui.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.prctica07_menlateral.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var _binding: FragmentInfoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val slideshowViewModel = ViewModelProvider(this).get(SlideshowViewModel::class.java)
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}