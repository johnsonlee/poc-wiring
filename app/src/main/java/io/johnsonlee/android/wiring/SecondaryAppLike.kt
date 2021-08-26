package io.johnsonlee.android.wiring

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import io.johnsonlee.android.architecture.AppLike
import javax.inject.Inject

class SecondaryAppLike @Inject constructor(
    @ApplicationContext context: Context
) : AppLike {
    override fun onCreate() {
    }
}