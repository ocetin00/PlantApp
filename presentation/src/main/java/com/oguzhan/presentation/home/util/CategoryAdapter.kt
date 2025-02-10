package com.oguzhan.presentation.home.util

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.oguzhan.presentation.R
import com.oguzhan.presentation.home.model.CategoryUiModel

class CategoryAdapter(

) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    private val categories: MutableList<CategoryUiModel?> = mutableListOf()

    inner class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val iconView: ImageView = view.findViewById(R.id.category_image)
        private val nameView: TextView = view.findViewById(R.id.category_title)


        private val radiusInPx =
            12 * Resources.getSystem().displayMetrics.density // dp'yi px'e çeviriyoruz

        fun bind(categoryUiModel: CategoryUiModel) {
            nameView.text = categoryUiModel.title
            iconView.load(categoryUiModel.image?.url) {
                transformations(RoundedCornersTransformation(radiusInPx))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        categories[position].let { it?.let { it1 -> holder.bind(it1) } }
    }

    fun updateData(newList: List<CategoryUiModel>) {
        categories.clear()
        categories.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = categories.size
}