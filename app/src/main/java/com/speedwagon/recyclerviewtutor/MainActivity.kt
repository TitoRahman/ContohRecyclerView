package com.speedwagon.recyclerviewtutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val itemList = createDummy(10)
        recyclerView.adapter = mainAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createDummy (n : Int) : ArrayList<listItem>{
        val listOfItem = arrayListOf<listItem>()
        for (i in 0..n){
            listOfItem.add(listItem("Bob $i", "$i", R.drawable.profile_template))
        }
        return listOfItem
    }
}