package com.mobile.miftakhulilmanrifqi082.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobile.miftakhulilmanrifqi082.recyclerview.databinding.DataitemBinding

class DataPribAdapter (val dataPribList: List<DataPrib>) :
    RecyclerView.Adapter<DataPribAdapter.DataPribViewHolder>() {

    inner class DataPribViewHolder(val binding: DataitemBinding)
        :RecyclerView.ViewHolder(binding.root)

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataPribViewHolder {
        val binding = DataitemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return DataPribViewHolder(binding)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return dataPribList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: DataPribViewHolder, position: Int) {
        with(holder) {
            with(dataPribList[position]) {
                binding.namaPrib.text = this.nama

            }
        }
    }
}

