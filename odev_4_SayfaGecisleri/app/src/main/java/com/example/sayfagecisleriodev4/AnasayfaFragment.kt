package com.example.sayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisleriodev4.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)
        tasarim.buttonSayfaAGit.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gecisA)
        }
        tasarim.buttonSayfaXGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisX)
        }
        return tasarim.root
    }
}