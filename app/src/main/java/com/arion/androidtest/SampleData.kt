package com.arion.androidtest

import com.arion.androidtest.models.Posts

object SampleData {
    private val name = listOf("Arun","Ananth","Raja")
    private val posts = listOf(R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3)
    val home = List<Posts>(10){
        Posts(R.drawable.person,name[it% name.size], posts,5,"Get meaning and translation of Discription in Hindi language with grammar, antonyms, synonyms and sentences usages")
    }
}

inline fun <T> List(size: Int, init: (index: Int) -> T): List<T> = MutableList(size, init)