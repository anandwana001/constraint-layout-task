package com.akshay.constraintexample

import android.os.Bundle
import android.os.Handler
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.keyframe1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyframe1)
    }

    override fun onStart() {
        super.onStart()
        Handler().postDelayed({
            val animationConstraint = ConstraintSet()
            animationConstraint.clone(this, R.layout.activity_main)
            TransitionManager.beginDelayedTransition(clKeyframe)
            animationConstraint.applyTo(clKeyframe)
        }, 500)
    }
}
