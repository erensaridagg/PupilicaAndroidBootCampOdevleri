package com.example.sayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisleriodev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var sayfaATasarim: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sayfaATasarim = FragmentSayfaABinding.inflate(inflater, container, false)
        sayfaATasarim.sayfaBGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisB)
        }
        return sayfaATasarim.root
    }
}