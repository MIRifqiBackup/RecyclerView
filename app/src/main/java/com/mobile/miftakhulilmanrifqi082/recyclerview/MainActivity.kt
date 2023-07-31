package com.mobile.miftakhulilmanrifqi082.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobile.miftakhulilmanrifqi082.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var list : List<DataPrib>
    private lateinit var rvAdapter : DataPribAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // load data to DataPrib list
        loadData()

        // create  layoutManager
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        // pass it to rvData layoutManager
        binding.rvData.setLayoutManager(layoutManager)

        // initialize the adapter,
        // and pass the required argument
        rvAdapter = DataPribAdapter(list)

        // attach adapter to the recycler view
        binding.rvData.adapter = rvAdapter
    }

    fun loadData(){
        list = listOf(
            DataPrib("Ningrum"),
            DataPrib("Lucia"),
            DataPrib("Andi"),
            DataPrib("Nana"),
            DataPrib("Shanti"),
            DataPrib("Yuli"),
            DataPrib("Yanti"),
            DataPrib("Yanto"),
            DataPrib("Deni"),
            DataPrib("Pardi"),
            DataPrib("Jojo"),
            DataPrib("Ima"),
            DataPrib("Tinah")
        )
    }
}
