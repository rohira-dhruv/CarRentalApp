package com.example.carrentalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cars= listOf(
            Cars("Sedan","Honda city","https://www.carblogindia.com/wp-content/uploads/2020/05/Next-gen-Honda-City-1024x577.jpg",500,"Diesel","Automatic",5),
            Cars("SUV","Toyota Innova Crysta","https://imgd.aeplcdn.com/1280x720/n/cw/ec/51435/innova-crysta-exterior-right-front-three-quarter-3.jpeg?q=85",500,"Diesel","Automatic",5),
            Cars("Sedan","Honda city","",500,"Diesel","Automatic",5),
            Cars("Sedan","Honda city","",500,"Diesel","Automatic",5),
            Cars("Sedan","Honda city","",500,"Diesel","Automatic",5),
            Cars("Sedan","Honda city","",500,"Diesel","Automatic",5),
            Cars("Sedan","Honda city","",500,"Diesel","Automatic",5),

        )
        val recyclerview_cars = findViewById(R.id.recyclerviewCars) as RecyclerView
        val adapter = CarsAdapter(cars)
        recyclerview_cars.adapter= adapter
        recyclerview_cars.layoutManager= LinearLayoutManager(this)
    }

}