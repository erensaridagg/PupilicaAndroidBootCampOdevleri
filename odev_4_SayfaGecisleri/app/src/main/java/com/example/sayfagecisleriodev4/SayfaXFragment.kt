package com.example.sayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecisleriodev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {

    private lateinit var sayfaXBinding: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sayfaXBinding = FragmentSayfaXBinding.inflate(inflater, container, false)
        sayfaXBinding.sayfaXtoYGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisXtoY)
        }
        return sayfaXBinding.root
    }
}