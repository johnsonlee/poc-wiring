package io.johnsonlee.android.wiring

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.johnsonlee.android.architecture.AppLike
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppLikes(appLikes: Set<@JvmSuppressWildcards AppLike>): AppLikes {
        return AppLikes(appLikes)
    }

}