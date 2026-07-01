package com.project.habittracker.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.project.habittracker.model.Habit

@Dao
interface HabitDao {

    @Query("SELECT * FROM Habit WHERE username = :username")
    fun getAllHabit(username: String): List<Habit>

    @Insert
    fun insertHabit(habit: Habit)

    @Update
    fun updateHabit(habit: Habit)

}