package com.example.doadandzikirapp.helper

import com.example.doadandzikirapp.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}