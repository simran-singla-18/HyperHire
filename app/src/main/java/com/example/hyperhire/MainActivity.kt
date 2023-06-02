package com.example.hyperhire

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<String>
    private lateinit var chipGroup: ChipGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = ArrayList<String>()
        list.add("#2023")
        list.add("#TODAYISMONDAY")
        list.add("#TOP")
        list.add("#POPS!")
        list.add("#WOW")
        list.add("#ROW")
        chipGroup = findViewById(R.id.chips)

        for (chipText in 0 until list.size) {
            setChipData(chipText, list)
        }
    }

    fun setChipData(chipText: Int, list: ArrayList<String>) {
        val lChip = Chip(this)
        lChip.isCheckedIconVisible = false
        lChip.setChipBackgroundColor(resources.getColorStateList(R.color.chip_color, null))
        lChip.chipCornerRadius = 86f
        lChip.text = list[chipText]
        chipGroup.addView(lChip);
    }
}
