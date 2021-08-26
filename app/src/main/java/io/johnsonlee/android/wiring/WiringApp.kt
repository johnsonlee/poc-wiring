package io.johnsonlee.android.wiring

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class WiringApp : Application() {

    @Inject lateinit var appLikes: AppLikes

    override fun onCreate() {
        super.onCreate()
        appLikes.onCreate()
    }

}