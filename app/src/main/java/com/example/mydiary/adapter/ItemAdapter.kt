package com.example.mydiary.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mydiary.R
import com.example.mydiary.data.User
import com.example.mydiary.fragments.list.ListFragmentDirections
import com.example.mydiary.model.Notes
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private lateinit var dataset: List<User>

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.itemView.item_title.text = item.Title
        holder.itemView.item_note.text = item.Note
    }

    fun setData(user: List<User>){
        this.dataset = user
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}