package com.example.prctica07_menlateral.ui.contacto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.prctica07_menlateral.Ferreteria
import com.example.prctica07_menlateral.R
import com.example.prctica07_menlateral.databinding.FragmentContactoBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ContactoFragment : Fragment() {
    private lateinit var nombre : EditText
    private lateinit var correo : EditText
    private lateinit var telefono : EditText
    private lateinit var spnProds : Spinner
    private lateinit var registrar : FloatingActionButton
    private var prodsSel : String = "A"
    private var _binding: FragmentContactoBinding? = null
    private var ferras : Ferreteria = Ferreteria()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentContactoBinding.inflate(inflater,container,false)
            //FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        nombre = root.findViewById(R.id.etNombre)
        correo = root.findViewById(R.id.etCorreo)
        telefono = root.findViewById(R.id.etTelefono)
        spnProds = root.findViewById(R.id.spnProds)
        registrar = root.findViewById(R.id.btnRegistrar)

        val productos = resources.getStringArray(R.array.productos)
        val prods = ArrayAdapter(requireContext(),R.layout.spinner_color_dropdown,productos)
        spnProds.adapter = prods
        spnProds.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                prodsSel = productos[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        registrar.setOnClickListener {
            addData()  // Llamar al método addData cuando se presiona el botón
        }
        return root

    }
    private fun addData(){
        if(nombre.text.isNotBlank() && nombre.text.isNotEmpty() && correo.text.isNotBlank() && correo.text.isNotEmpty() && telefono.text.isNotEmpty() && telefono.text.isNotBlank() )
        {
            ferras.nombre = nombre.text.toString()
            ferras.correo = correo.text.toString()
            ferras.telefono = telefono.text.toString()
            ferras.prods = prodsSel
            Toast.makeText(requireContext(),"Registrado: ${ferras.nombre} | ${ferras.correo} | ${ferras.telefono} | ${ferras.prods}"
            ,Toast.LENGTH_LONG).show()
            cleanBoxes()

        }else {
            // Mostrar mensaje de error si hay campos vacíos o inválidos
            Toast.makeText(requireContext(), "Por favor, completa todos los campos correctamente", Toast.LENGTH_SHORT).show()
        }
    }
    private fun cleanBoxes(){
        nombre.text = null
        correo.text = null
        telefono.text = null
        spnProds.setSelection(0)
        nombre.requestFocus()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}