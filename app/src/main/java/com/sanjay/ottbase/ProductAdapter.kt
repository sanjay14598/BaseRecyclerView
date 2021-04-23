package com.sanjay.ottbase

import com.sanjay.ottbase.databinding.ListOfProductBinding

class ProductAdapter : BaseRecyclerViewAdapter<Product, ListOfProductBinding>() {

    override fun getLayout() = R.layout.list_of_product

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ListOfProductBinding>,
        position: Int
    ) {
        holder.binding.product = items[position]
        holder.binding.root.setOnClickListener {
            listener?.invoke(it, items[position], position)
        }
    }
}