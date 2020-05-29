package com.alikhajeh.persiancalendar

import android.app.Application
import com.alikhajeh.persiancalendar.utils.initUtils

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ReleaseDebugDifference.mainApplication(this)
        initUtils(applicationContext)
    }
}
