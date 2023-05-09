package com.example.genjutsucom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.genjutsucom.databinding.FragmentABinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val adapterCatalogue = adapter(requireActivity(), CategoriesList)
        val adapterCatalogue = adapter2(requireActivity(), CategoriesList){
            when(it.nombre){
                "Abecedario" ->{
                    Navigation.findNavController(view).navigate(R.id.action_AFragment_to_abecedarioFragment)
                }
                else ->{
                    Navigation.findNavController(view).navigate(R.id.action_AFragment_to_catalogueFragment)
                }
            }
            //Navigation.findNavController(view).navigate(R.id.action_AFragment_to_catalogueFragment)
        }
        binding.rvCatalogue.adapter = adapterCatalogue
        binding.rvCatalogue.layoutManager = GridLayoutManager(requireActivity(), 2,
                                            RecyclerView.VERTICAL, false)
    }
}