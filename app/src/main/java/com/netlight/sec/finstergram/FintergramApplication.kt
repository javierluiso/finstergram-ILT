package com.netlight.sec.finstergram

import android.app.Application
import com.netlight.sec.finstergram.data.UserSettings

class ILTgramApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        UserSettings.load(this)
    }
}