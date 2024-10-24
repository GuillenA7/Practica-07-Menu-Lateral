package com.example.prctica07_menlateral.ui.productos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.prctica07_menlateral.databinding.FragmentProductosBinding

class ProductosFragment : Fragment() {

    private var _binding: FragmentProductosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProductosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgFoco.setOnClickListener{
            Toast.makeText(activity,"Foco",Toast.LENGTH_SHORT).show()
        }
        binding.imgPala.setOnClickListener{
            Toast.makeText(activity,"Escalera",Toast.LENGTH_SHORT).show()
        }
        binding.imgPico.setOnClickListener{
            Toast.makeText(activity,"Manguera",Toast.LENGTH_SHORT).show()
        }
        binding.imgSoplete.setOnClickListener{
            Toast.makeText(activity,"Soplete",Toast.LENGTH_SHORT).show()
        }
        binding.imgTaladro.setOnClickListener{
            Toast.makeText(activity,"Taladro",Toast.LENGTH_SHORT).show()
        }
        binding.imgCarretilla.setOnClickListener{
            Toast.makeText(activity,"Carretilla",Toast.LENGTH_SHORT).show()
        }
        binding.imgDestapacano.setOnClickListener{
            Toast.makeText(activity,"Destapacaño",Toast.LENGTH_SHORT).show()
        }
        binding.imgGusanoPvc.setOnClickListener{
            Toast.makeText(activity,"Gusano de pvc",Toast.LENGTH_SHORT).show()
        }
        binding.imgCintaAislante.setOnClickListener{
            Toast.makeText(activity,"Cinta",Toast.LENGTH_SHORT).show()
        }
        binding.imgCintaMetrica.setOnClickListener{
            Toast.makeText(activity,"Cinta metrica",Toast.LENGTH_SHORT).show()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}