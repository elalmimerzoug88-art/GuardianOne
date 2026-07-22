package com.guardianone.app.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface EventLogDao {
    @Query("SELECT * FROM event_logs ORDER BY timestampMillis DESC")
    fun getAllEvents(): Flow<List<EventLog>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(eventLog: EventLog): Long

    @Delete
    suspend fun deleteEvent(eventLog: EventLog)

    @Query("DELETE FROM event_logs")
    suspend fun clearAllEvents()
}
