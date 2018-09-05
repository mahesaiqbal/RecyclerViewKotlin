package com.mahesaiqbal.recyclerviewkotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mahesaiqbal.recyclerviewkotlin.R
import kotlinx.android.synthetic.main.country_item.view.*

class CountryAdapter(country: List<String>, ctx: Context) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    var list = country
    var context = ctx

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.country_item, parent, false)
        return CountryViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.name.text = list.get(position)
    }

    override fun getItemCount(): Int = list.size

    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.country_name
    }
}