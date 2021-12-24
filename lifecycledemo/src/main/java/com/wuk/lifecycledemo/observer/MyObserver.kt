package com.wuk.wkjectpack

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author wuk
 * @date 2021/11/10
 */
class MyObserver : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun ontestResume(){
        Log.e("TAG", "ontestSTART: " )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun ontestPause(){
        Log.e("TAG", "ontestSTOP: " )
    }
}