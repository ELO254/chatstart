package com.example.groupi_recycleview

import android.content.ClipData
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recy:RecyclerView = findViewById(R.id.recy)

        var list = listOf("me","you")

        var adapter = fromAdapter()
        recy.adapter = adapter
        recy.layoutManager = LinearLayoutManager(this)







    }
}
