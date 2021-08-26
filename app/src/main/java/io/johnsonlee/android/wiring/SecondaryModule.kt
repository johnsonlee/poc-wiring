package io.johnsonlee.android.wiring

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import io.johnsonlee.android.architecture.AppLike

@Module
@InstallIn(SingletonComponent::class)
interface SecondaryModule {

    @Binds
    @IntoSet
    fun bindSecondaryAppLike(impl: SecondaryAppLike): AppLike

}