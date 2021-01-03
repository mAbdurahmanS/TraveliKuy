package com.example.travelikuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import java.util.ArrayList

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("a","Cirebon",R.drawable.ic_launcher_background))
        arrayList.add(Model("b","Cirebon",R.drawable.ic_launcher_background))
        arrayList.add(Model("c","Cirebon",R.drawable.ic_launcher_background))
        arrayList.add(Model("d","Cirebon",R.drawable.ic_launcher_background))
        arrayList.add(Model("e","Cirebon",R.drawable.ic_launcher_background))

        val myAdapter = MyAdapter(arrayList,this)

        rv_home.layoutManager =LinearLayoutManager(this)
        rv_home.adapter = myAdapter
    }
}