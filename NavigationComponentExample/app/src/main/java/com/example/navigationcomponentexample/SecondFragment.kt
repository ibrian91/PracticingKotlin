package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexample.R.*


class SecondFragment : Fragment() {

    //PASO 3 ENVIO DE ARGS
    // variable local la cual recibe el argumento

    val args:SecondFragmentArgs by navArgs()

    //PASO 4 ENVIO DE ARGS
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = args.name

        // PASO 5 ENVIO DE ARGS

        val tvName = view.findViewById<TextView>(R.id.tName)
        tvName.text = name

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val btnNavigate = view.findViewById<Button>(R.id.btnNavigate2)

        btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return view
    }

}