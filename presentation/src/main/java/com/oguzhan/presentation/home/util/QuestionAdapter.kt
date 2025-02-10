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
import com.oguzhan.presentation.home.model.QuestionUiModel

class QuestionAdapter() : RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {
    private val questions: MutableList<QuestionUiModel?> = mutableListOf()

    inner class QuestionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val iconView: ImageView = view.findViewById(R.id.question_image)
        private val nameView: TextView = view.findViewById(R.id.question_title)

        private val radiusInPx = 12 * Resources.getSystem().displayMetrics.density // dp'yi px'e çeviriyoruz


        fun bind(categoryUiModel: QuestionUiModel) {
            nameView.text = categoryUiModel.title
            iconView.load(categoryUiModel.img) {
                transformations(RoundedCornersTransformation(radiusInPx))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.question_item, parent, false)
        return QuestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        questions[position].let { it?.let { it1 -> holder.bind(it1) } }
    }

    fun updateData(newList: List<QuestionUiModel>) {
        questions.clear()
        questions.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = questions.size
}