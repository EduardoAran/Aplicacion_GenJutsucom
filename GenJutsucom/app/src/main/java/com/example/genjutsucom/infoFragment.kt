package com.example.genjutsucom

import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.genjutsucom.databinding.FragmentAbecedarioBinding
import com.example.genjutsucom.databinding.FragmentInfoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [infoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class infoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInfoBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            val contenido = it.get("categorias") as Categorias

            val uri: Uri = Uri.parse("android.resource://" + this.javaClass.packageName + "/" + contenido.image_url.toInt())

            binding.textView4.text = contenido.nombre
            binding.textView5.text = contenido.nombre

            if (contenido.nombre == "j" || contenido.nombre == "k" || contenido.nombre == "ll" || contenido.nombre == "ñ"
                || contenido.nombre == "q" || contenido.nombre == "rr"
                || contenido.nombre == "x" || contenido.nombre == "z"){

                binding.videoView.setVideoURI(uri)
                binding.videoView.setOnPreparedListener { binding.videoView.start() }
                //Glide.with(requireActivity()).load(uri).into(binding.videoView)
                binding.imageView.visibility = View.GONE
                binding.videoView.visibility = View.VISIBLE
            } else {
                Glide.with(requireActivity()).load(contenido.image_url.toInt()).into(binding.imageView)
                binding.imageView.visibility = View.VISIBLE
                binding.videoView.visibility = View.GONE
            }
        }
    }
}