package com.example.daggerpractice

import android.graphics.drawable.Drawable
import android.os.Bundle
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    var logo: Drawable? = null
        @Inject set
    var requestManager: RequestManager? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setLogo()
    }

    private fun setLogo() {
        requestManager
            ?.load(logo)
            ?.into(imageView)
    }


    companion object {
        private const val TAG = "MainActivity"
    }
}