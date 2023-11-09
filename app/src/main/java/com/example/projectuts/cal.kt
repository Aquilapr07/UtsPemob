package com.example.projectuts

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [cal.newInstance] factory method to
 * create an instance of this fragment.
 */
class cal : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_cal, container, false)

        var pilihan = 0

        var gEdt1 = rootView.findViewById<EditText>(R.id.Edtbil1)
        var gEdt2 = rootView.findViewById<EditText>(R.id.Edtbil2)
        var gSpin = rootView.findViewById<Spinner>(R.id.spin)
        var gBtncal = rootView.findViewById<Button>(R.id.BtnCal)
        var gTvHasil = rootView.findViewById<TextView>(R.id.hasil)

        gBtncal.setOnClickListener {
            var nilai1 = gEdt1.text.toString().toDouble()
            var nilai2 = gEdt2.text.toString().toDouble()
            var hasil = 0.0

            Log.d("non", "nilai1" + nilai1 + ", nilai2:" + nilai2)

            if (pilihan.equals(0)){
                hasil = nilai1 + nilai2
            }
            else if (pilihan.equals(1)){
                hasil = nilai1 - nilai2
            }
            else if (pilihan.equals(2)){
                hasil = nilai1 * nilai2
            }
            else if (pilihan.equals(3)){
                hasil = nilai1 / nilai2
            }

            gTvHasil.text = hasil.toString()
        }

        gSpin.setOnItemSelectedListener(

            object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                    Log.d("non", "pilih item: " + p2)
                    pilihan = p2
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        )

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment cal.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            cal().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}