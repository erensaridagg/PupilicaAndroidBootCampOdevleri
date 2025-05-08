package com.example.sayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisleriodev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var sayfaBTasarim: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        sayfaBTasarim = FragmentSayfaBBinding.inflate(inflater, container, false)
        sayfaBTasarim.sayfaBtoYGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisBtoY)
        }

        return sayfaBTasarim.root
    }
}