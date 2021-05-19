package com.example.carrentalapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CarsAdapter(val cars: List<Cars>) : RecyclerView.Adapter<CarsAdapter.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.layout_cars, parent, false)
        )
    }

    override fun getItemCount() = cars.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = cars[position]
        holder.text_cartype.text=car.cartype
        holder.text_carname.text=car.carname
        holder.text_drivetype.text=car.drivetype
        holder.text_fueltype.text=car.fueltype
        holder.text_rate.text=car.rate.toString()
        holder.text_seatcap.text=car.seats.toString()
        Glide.with(holder.view.context)
            .load(car.image)
            .into(holder.image)

    }


    class CarViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        val text_cartype : TextView = itemView.findViewById(R.id.carType)
        val text_carname : TextView = itemView.findViewById(R.id.carName)
        val text_rate : TextView = itemView.findViewById(R.id.rate)
        val text_fueltype : TextView = itemView.findViewById(R.id.fuelType)
        val text_seatcap : TextView = itemView.findViewById(R.id.seatCapacity)
        val text_drivetype : TextView = itemView.findViewById(R.id.driveType)
        val image: ImageView= itemView.findViewById(R.id.carimage)
    }
}