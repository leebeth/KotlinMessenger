package com.leebethanacona.kotlinmessenger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

abstract class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
