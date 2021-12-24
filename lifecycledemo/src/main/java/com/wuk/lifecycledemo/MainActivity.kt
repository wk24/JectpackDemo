package com.wuk.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wuk.lifecycledemo.observer.MyView
import com.wuk.wkjectpack.MyObserver
import com.wuk.wkjectpack.MyObserver2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myView: MyView = findViewById<MyView>(R.id.my_view);

//        lifecycle.addObserver(MyObserver())
        lifecycle.addObserver(MyObserver2())
        lifecycle.addObserver(myView)
    }
}