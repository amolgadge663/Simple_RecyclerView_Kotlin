package com.amolsoftwares.rvhotel_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Amol Gadage", "Sangamner, Maharashtra"))
        users.add(User("Rutuja Kardile", "Sangamner, Maharashtra"))
        users.add(User("Varsha Shirsath", "Sangamner, Maharashtra"))
        users.add(User("Avinash Kamble", "Sangamner, Maharashtra"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter

    }
}