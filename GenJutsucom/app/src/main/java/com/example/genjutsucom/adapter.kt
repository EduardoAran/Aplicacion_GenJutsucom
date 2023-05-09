package com.example.genjutsucom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.genjutsucom.databinding.ItemCatalogueBinding

class adapter (var context: Context, var data: List<Categorias>) : RecyclerView.Adapter<adapter.ViewHolder>(){

    class ViewHolder (val binding: ItemCatalogueBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCatalogueBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
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