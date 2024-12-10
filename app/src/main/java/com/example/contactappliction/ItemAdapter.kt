package com.example.contactappliction

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.text_view_name)
        val imageView: ImageView = view.findViewById(R.id.image_view_profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.nameTextView.text = item.name

        holder.imageView.setImageResource(item.imageResId)


        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, ContactDetailActivity::class.java).apply {
                putExtra("name", item.name)
                putExtra("imageResId", item.imageResId)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = items.size
}
