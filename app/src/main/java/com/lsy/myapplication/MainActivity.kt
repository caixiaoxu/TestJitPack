package com.lsy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsy.l1.L1Test
import com.lsy.l2.L2Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        L1Test.show()
        L2Test.show()
    }
}