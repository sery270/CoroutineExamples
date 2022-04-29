package com.example.diffutilbycoroutine

import android.content.res.ColorStateList
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("changeTint")
fun View.changeTint(tints: Int) {
    if (this is ImageView) {
        imageTintList = ColorStateList.valueOf(ContextCompat.getColor(context, tints))
        return
    }
    if (this is TextView) {
        backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(context, tints))
        return
    }
    setBackgroundResource(tints)
}