package com.amolsoftwares.rvhotel_k

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val hotelList: ArrayList<Hotel>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.team1_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(hotelList[position])
    }

    override fun getItemCount(): Int {
        return hotelList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(hotel: Hotel) {
            val tvName = itemView.findViewById(R.id.tv_name) as TextView
            val tvAddress = itemView.findViewById(R.id.tv_address) as TextView
            val rate = itemView.findViewById(R.id.ratingBar) as RatingBar
            val tvReview = itemView.findViewById(R.id.tv_reviews) as TextView
            val tvPrice = itemView.findViewById(R.id.tv_price) as TextView
            val tvRoomTime = itemView.findViewById(R.id.tv_room_time) as TextView
            //val iv_proPic = itemView.findViewById(R.id.iv_pic) as ImageView
            val iv_isFav = itemView.findViewById(R.id.iv_fav) as ImageView


            tvName.text = hotel.name
            tvAddress.text = hotel.address
            rate.rating = hotel.rate
            tvReview.text = hotel.reviews
            tvPrice.text = hotel.price
            tvRoomTime.text = hotel.roomTime

            iv_isFav.visibility = if (hotel.isFav) View.VISIBLE else View.INVISIBLE

        }
    }
}
