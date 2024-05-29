package com.training.myproject
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(
    private val animalList: List<Int>,
    private val itemClick: ItemClick
): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }


    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val item = animalList[position]
        holder.onBind(item)
        holder.itemView.setOnClickListener {
            itemClick.onItemClick(position = position)
        }

    }

    class AnimalViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        private var animalImage: ImageView? = null


        fun onBind(resId: Int) {
            animalImage = itemView.findViewById(R.id.animalImage)
            animalImage?.setImageResource(resId)

        }


    }


}