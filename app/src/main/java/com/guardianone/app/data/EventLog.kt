package com.guardianone.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event_logs")
data class EventLog(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val timestampMillis: Long,
    val durationMillis: Long,
    val videoFilePath: String,
    val thumbnailFilePath: String,
    val motionPeakScore: Float,
    val cameraFacing: String,
    val fileSizeBytes: Long
)
