package com.a.moviehelper.ui.feature.details.show

import androidx.lifecycle.ViewModel
import com.a.moviehelper.common.viewmodel.ViewModelKey
import com.a.moviehelper.ui.feature.details.movie.MovieDetailsPresenter
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ShowDetailsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ShowDetailsPresenter::class)
    internal abstract fun bindPresenter(presenter: ShowDetailsPresenter): ViewModel
}