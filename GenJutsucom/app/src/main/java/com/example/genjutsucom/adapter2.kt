package com.example.genjutsucom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.genjutsucom.databinding.ItemCatalogueBinding

class adapter2 (var context: Context, var data: List<Categorias>, private val funcionX: (Categorias) -> Unit) : RecyclerView.Adapter<adapter2.ViewHolder>(){

    class ViewHolder (val binding: ItemCatalogueBinding, funcionZ: (Int) -> Unit) : RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                funcionZ(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCatalogueBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view){
            funcionX(data[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            catalogueName.text = data[position].nombre
        }
        Glide.with(context)
            .load(data[position].image_url)
            .into(holder.binding.catalogueImage)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}