package com.example.doadandzikirapp.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.model.Artikel

class DetailArtikelActivity : AppCompatActivity() {

    private lateinit var imgDetail: ImageView
    private lateinit var tvTitle: TextView
    private lateinit var tvDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Artikel Islami"

        setContentView(R.layout.activity_detail_artikel)
        val dataArtikel = intent.getParcelableExtra<Artikel>("data")

        imgDetail = findViewById(R.id.img_detail)
        tvTitle = findViewById(R.id.tv_detail_title)
        tvDesc = findViewById(R.id.tv_detail_desc)

        imgDetail.setImageResource(dataArtikel!!.imageArtikel)
        tvTitle.text = dataArtikel.titleArtikel
        tvDesc.text = dataArtikel.descArtikel
    }
}