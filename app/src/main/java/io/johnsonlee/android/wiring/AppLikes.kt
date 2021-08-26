package io.johnsonlee.android.wiring

import io.johnsonlee.android.architecture.AppLike
import javax.inject.Inject

class AppLikes @Inject constructor(
    private val appLikes: Set<@JvmSuppressWildcards AppLike>
) : AppLike {

    override fun onCreate() {
        appLikes.forEach(AppLike::onCreate)
    }

}