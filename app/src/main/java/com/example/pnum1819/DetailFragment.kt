package com.example.pnum1819

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val infoTextView = view?.findViewById<TextView>(R.id.detail_textView)
        //infoTextView?.text = selectedItem
        val imageView = view?.findViewById<ImageView>(R.id.imageViewPanda)

        when (selectedItem) {
            "Афганская лиса" -> {
                infoTextView?.text= getString(R.string.afganskaya)
                imageView?.setImageResource(R.drawable.afganskaya)
            }
            "Бенгальская лиса"-> {
                infoTextView?.text= getString(R.string.bengalskaya)
                imageView?.setImageResource(R.drawable.bengalskaya)
            }
            "Фенек" -> {
                infoTextView?.text= getString(R.string.fenek)
                imageView?.setImageResource(R.drawable.fenek)
            }
            "Корсак"-> {
                infoTextView?.text= getString(R.string.korsak)
                imageView?.setImageResource(R.drawable.korsak)
            }
            "Песец" -> {
                infoTextView?.text= getString(R.string.pesetch)
                imageView?.setImageResource(R.drawable.pesetch)
            }
            "Тибетская лиса"-> {
                infoTextView?.text= getString(R.string.tibetskaya)
                imageView?.setImageResource(R.drawable.tibetskaya)
            }
            "Южноафриканская лиса"-> {
                infoTextView?.text= getString(R.string.ujnoafrican)
                imageView?.setImageResource(R.drawable.ujnoafrican)
            }
        }
    }

}