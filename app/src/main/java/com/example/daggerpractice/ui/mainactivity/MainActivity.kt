package com.example.daggerpractice.ui.mainactivity

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.example.daggerpractice.R
import com.example.daggerpractice.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    lateinit var viewModel: MainViewModel

    var providerFactory: ViewModelProviderFactory? = null
        @Inject set

    var logo: Drawable? = null
        @Inject set

    var requestManager: RequestManager? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = providerFactory?.let {
            ViewModelProvider(this,
                it
            ).get(MainViewModel::class.java)
        }!!

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