package com.aziz.trango

import android.graphics.Interpolator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.DecelerateInterpolator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layers_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val anim = createAnimation()
        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                Thread.sleep(150)
                val anim2 = createAnimation()
                shadow2.startAnimation(anim2)
                anim2.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(animation: Animation?) {
                        Thread.sleep(150)
                        val anim3 = createAnimation()
                        shadow3.startAnimation(anim3)
                    }

                    override fun onAnimationEnd(animation: Animation?) {

                    }

                    override fun onAnimationRepeat(animation: Animation?) {

                    }

                })
            }

            override fun onAnimationEnd(animation: Animation?) {

            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
        shadow.startAnimation(anim)
    }


    private fun createAnimation(): Animation {
        val anim = AnimationUtils.loadAnimation(this, android.R.anim.fade_out)
        anim.duration = 1500
        anim.repeatMode = Animation.REVERSE
        anim.fillAfter = false
        anim.repeatCount = 100
        return anim
    }
}