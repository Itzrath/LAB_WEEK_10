package com.example.lab_week_10.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

// Declare a Dao with the @Dao annotation
@Dao
interface TotalDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(total: Total)
    // @Update is used to update an existing row
    @Update
    fun update(total: Total)
// @Delete is used to delete an existing row
    @Delete
fun delete(total: Total)
    @Query("SELECT * FROM total WHERE id = :id")
    fun getTotal(id: Long): List<Total>
}
