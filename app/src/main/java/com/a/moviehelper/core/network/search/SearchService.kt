package com.a.moviehelper.core.network.search

import com.a.moviehelper.core.network.movies.MoviePageModel
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

sealed interface SearchService {

    @GET("search/movie")
    fun searchMovies(
        @Query("query") query: String?,
        @Query("page") page: Int,
        @Query("api_key") userKey: String?
    ): Single<MoviePageModel>
}