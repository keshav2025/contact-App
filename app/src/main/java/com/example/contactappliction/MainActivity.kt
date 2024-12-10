package com.example.contactappliction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val items = listOf(
            Item("Keshav ",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 9),
            Item("Adarsh Gupta", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 4 ),
            Item("Aryan kumar",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 4),
            Item("Sonu raj", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 4 ),
            Item("Aditya raj",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 4),
            Item("Ramesh",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 4),
            Item("keshav",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 4),
            Item("Aditya ",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 ,4),
            Item("Dinesh",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 ,4),
            Item("Ashis",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 5),
            Item("Manash", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 ,5 ),
            Item("Vikas",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 5),
            Item("Ujjwal",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 67),
            Item("Nikhil",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 56),
            Item("Khushi", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 5),
            Item("Abhishek kumar",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 6),
            Item("Raman Raj",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 , 56),
            Item("Riya", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 56),
            Item("Priya",  R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721 ,5),
            Item("Rohan pal", R.drawable.vecteezy_ai_generated_business_man_on_transparent_background_37135721, 5)
        )


        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(items)
    }
}

data class Item(
    val name: String,
    val imageResId: Int,
    val number: Int
)


