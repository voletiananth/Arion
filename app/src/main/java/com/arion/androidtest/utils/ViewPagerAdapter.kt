package com.arion.androidtest.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arion.androidtest.R
import com.arion.androidtest.databinding.ItemRvHomeBinding
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily

class ViewPagerAdapter (private val list: List<Int>): RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {


    class ViewHolder(private val item: ImageView) : RecyclerView.ViewHolder(item){
        fun bind(value: Int){
            item.setImageResource(value)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val imageView = ShapeableImageView(parent.context)
        imageView.shapeAppearanceModel = imageView.shapeAppearanceModel
            .toBuilder()
            .setAllCornerSizes(parent.resources.getDimension(R.dimen.radius))
            .build();
        imageView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
        return ViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}