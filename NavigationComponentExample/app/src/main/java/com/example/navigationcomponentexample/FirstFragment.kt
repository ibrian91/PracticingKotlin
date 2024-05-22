package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // inflamos la vista
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // buscamos el boton dentro de la vista
        val btnNavigate = view.findViewById<Button>(R.id.btnNavigate)

        // porque justamente necesito para que al hacer click se ejecute la accion de ir al segundo fragment
        // en este caso encuentro el boton y le digo che ejecuta tu propia accion

        // LO DE ABAJO LO DEJO COMENTADO PORQUE FUE LA PRIMERA VEZ QUE ENVIE ARGUMENTOS.
        /*ES UNA FORMA DE CAMBIAR DE FRAGMENT PERO SIN ARGUMENTOS. HACIENDO CLICK PUNTUALMENTE EN UN BOTON*/


     /*   btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
*/
        //PASO 2 ENVIO DE ARGS

       /* FirstFragmentDirections es la clase que creo la dependencia safeargs
        automaticamente toma la action que yo puse en la vista*/

          btnNavigate.setOnClickListener {
          findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(name = "Ibrix"))
        }

return view




}


}