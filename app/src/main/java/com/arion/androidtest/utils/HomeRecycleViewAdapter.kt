package com.arion.androidtest.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arion.androidtest.R
import com.arion.androidtest.databinding.ItemRvHomeBinding
import com.arion.androidtest.models.Posts
import com.google.android.material.tabs.TabLayoutMediator

class HomeRecycleViewAdapter(private val list: List<Posts>): RecyclerView.Adapter<HomeRecycleViewAdapter.ViewHolder>() {
    class ViewHolder(private val item: ItemRvHomeBinding) :RecyclerView.ViewHolder(item.root){
        fun bind(posts: Posts){
            item.apply {
                userProfile.setImageResource( posts.dp)
                userName.text = posts.name
                userPosts.adapter = ViewPagerAdapter(posts.postImages)
                userProfile1.setImageResource(posts.dp)
                userLikes1.setImageResource(posts.dp)
                userLikes2.setImageResource(posts.dp)
                userLikes3.setImageResource(posts.dp)
                userName1.text = posts.name
                description.text = posts.description
                val likes = "${posts.likes} Likes"
                likesCount.text = likes
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRvHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}