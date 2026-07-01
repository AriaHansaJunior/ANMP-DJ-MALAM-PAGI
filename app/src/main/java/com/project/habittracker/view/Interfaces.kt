package com.project.habittracker.view

import android.view.View
import com.project.habittracker.model.Habit

interface EditHabitListener {
    fun onClick(v: View)
}

interface DashboardHabitListener {
    fun onPlusClick(v: View, habit: Habit)
    fun onMinusClick(v: View, habit: Habit)
}