package com.aziz.trango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val DELAY = 300L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            rip0.startRippleAnimation()
            Handler(Looper.getMainLooper()).postDelayed({
                rip1.startRippleAnimation()
                Handler(Looper.getMainLooper()).postDelayed({
                    rip2.startRippleAnimation()
                    Handler(Looper.getMainLooper()).postDelayed({
                        rip3.startRippleAnimation()
                        Handler(Looper.getMainLooper()).postDelayed({
                            rip4.startRippleAnimation()
                            Handler(Looper.getMainLooper()).postDelayed({
                                rip5.startRippleAnimation()
                            }, DELAY)
                        }, DELAY)
                    }, DELAY)
                }, DELAY)
            }, DELAY)
        }, DELAY)

    }
}