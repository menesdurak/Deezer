package com.menesdurak.appterncasestudy.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.menesdurak.appterncasestudy.data.model.FavoriteTrack

@Dao
interface FavoriteTrackDao {

    @Insert
    suspend fun addFavoriteTrack(favoriteTrack: FavoriteTrack)

    @Delete
    suspend fun deleteFavoriteTrack(favoriteTrack: FavoriteTrack)

    @Query("SELECT * FROM favorite_tracks_table ORDER BY localId ASC")
    fun getAllFavoriteTracks(): List<FavoriteTrack>

}