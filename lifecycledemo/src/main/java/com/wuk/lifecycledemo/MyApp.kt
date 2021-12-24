package com.wuk.lifecycledemo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import com.wuk.wkjectpack.MyObserver

/**
 * @author wuk
 * @date 2021/12/23
 */
class MyApp : Application() {


    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(MyObserver())
    }
}