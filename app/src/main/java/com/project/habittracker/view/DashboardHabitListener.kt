package com.project.habittracker.view

import android.view.View
import com.project.habittracker.model.Habit

interface DashboardHabitListener {
    fun onPlusClick(v: View, habit: Habit)
    fun onMinusClick(v: View, habit: Habit)
}