package com.example.projectbp2726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBookKid:Button = findViewById(R.id.buttonMenu1)
        btnBookKid.setOnClickListener {
            val intent = Intent(this,BookKidActivity::class.java)
            startActivity(intent)
        }
        val btnMore:Button = findViewById(R.id.buttonMenu4)
        btnBookKid.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout manager di recycler view
        rvBuku.layoutManager = LinearLayoutManager(this)
        //List data Buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure",
            "Lorem Ipsum Dolor Sit Amet"))
        data.add(
            BukuModel(R.drawable.book4, "Mermaid To Rescue",
                "Lorem Ipsum Dolor Sit Amet"))
        //set Adapter
        val adapter = AdapterHome(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter
    }
}