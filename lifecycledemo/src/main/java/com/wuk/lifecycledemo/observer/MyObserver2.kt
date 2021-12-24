package com.wuk.wkjectpack

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


/**
 * @author wuk
 * @date 2021/11/10
 */
class MyObserver2 : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.e("MyObserver2", "onCreate: ")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.e("MyObserver2", "onStart: ")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e("MyObserver2", "onResume: ")
    }

//    override fun onPause(owner: LifecycleOwner) {
//        super.onPause(owner)
//        Log.e("MyObserver2", "onPause: ")
//    }
//
//    override fun onStop(owner: LifecycleOwner) {
//        super.onStop(owner)
//        Log.e("MyObserver2", "onStop: ")
//    }
//
//    override fun onDestroy(owner: LifecycleOwner) {
//        super.onDestroy(owner)
//        Log.e("MyObserver2", "onDestroy: ")
//    }
}