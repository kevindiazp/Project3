package com.example.admin.project3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class App : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        mShowCount = findViewById<View>(R.id.show_count) as TextView
    }

    fun countUp(view: View) {
        mCount++
        if (mShowCount != null)
            mShowCount!!.text = Integer.toString(mCount)
    }

    fun showToast(view: View) {

        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG)
        toast.show()
    }

    fun showPoke(view: View) {

        val toast = Toast.makeText(this, R.string.poke_message, Toast.LENGTH_LONG)
        toast.show()
    }

    fun reset(view: View) {
        mCount = 0
        if (mShowCount != null)
            mShowCount!!.text = Integer.toString(mCount)
    }
}

