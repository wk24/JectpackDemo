package com.wuk.lifecycledemo.observer

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import javax.security.auth.login.LoginException

/**
 * @author wuk
 * @date 2021/11/17
 */
class MyView : LinearLayout, DefaultLifecycleObserver {

//    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
    }
//
//    constructor(
//        context: Context?,
//        attrs: AttributeSet?,
//        defStyleAttr: Int
//    ) : super(context, attrs, defStyleAttr) {
//    }


    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e("TAG", "onResume: MyView" )
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }
}