package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Deklarasi variabel
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menentukan LayoutManager untuk RecyclerView
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager

        //Link kan RecyclerView dengan class Adapter
        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter

//        card_view_layout.setOnClickListener {
//            val changeAct = Intent(this@MainActivity, MainActivity2::class.java)
//            startActivity(changeAct)
//        }

//        fun inte(view: View) {
//            val editText = findViewById<EditText>(R.id.editText)
//            val message = editText.text.toString()
//            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//                putExtra(EXTRA_MESSAGE, message)
//            }
//            startActivity(intent)
//        }


    }

}