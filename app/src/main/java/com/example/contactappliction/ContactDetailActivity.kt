package com.example.contactappliction

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        // mainActivity se data ko pass kr rhe hai contect_detail.xml mai
        val name = intent.getStringExtra("name")
        val imageResId = intent.getIntExtra("imageResId", 0)


        val nameTextView: TextView = findViewById(R.id.contact_name)
        val imageView: ImageView = findViewById(R.id.contact_image)

        nameTextView.text = name
        imageView.setImageResource(imageResId)
    }
}
