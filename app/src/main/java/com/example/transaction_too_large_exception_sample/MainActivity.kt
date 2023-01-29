package com.example.transaction_too_large_exception_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.transaction_too_large_exception_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        dataBinding.nextButton.setOnClickListener {
            val intent = NextActivity.createIntent(this, TooLargeString().string)
            startActivity(intent)
        }
    }
}