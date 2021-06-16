package com.amolsoftwares.rvhotel_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val hotel = ArrayList<Hotel>()

        hotel.add(
            Hotel(
                " ",
                false,
                "Chillax Heritage",
                "Santosa Road | 4.5KM from center",
                3.5f,
                "350 Reviews",
                "US \$450",
                "1 room 1 night (tax include)"
            )
        )
        hotel.add(
            Hotel(
                " ",
                true,
                "Hotel Bangkok Saran",
                "Orchard Road | 1KM from center",
                2.8f,
                "150 Reviews",
                "US \$150",
                "1 room 1 night (tax include)"
            )
        )
        hotel.add(
            Hotel(
                " ",
                false,
                "One 10",
                "Lavender Road | 3KM from center",
                4.8f,
                "256 Reviews",
                "US \$300",
                "1 room 1 night (tax include)"
            )
        )
        hotel.add(
            Hotel(
                " ",
                true,
                "Marina Lavender",
                "Lavender Road | 4KM from center",
                4.6f,
                "650 Reviews",
                "US \$320",
                "1 room 1 night (tax include)"
            )
        )
        hotel.add(
            Hotel(
                " ",
                false,
                "One 10",
                "Lavender Road | 3KM from center",
                4.8f,
                "256 Reviews",
                "US \$300",
                "1 room 1 night (tax include)"
            )
        )
        hotel.add(
            Hotel(
                " ",
                true,
                "Hotel Bangkok Saran",
                "Orchard Road | 1KM from center",
                3.2f,
                "154 Reviews",
                "US \$500",
                "1 room 1 night (tax include)"
            )
        )

        val adapter = CustomAdapter(hotel)

        recyclerView.adapter = adapter

    }
}