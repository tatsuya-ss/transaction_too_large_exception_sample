package com.example.transaction_too_large_exception_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.transaction_too_large_exception_sample.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_next)

        val string = intent.getStringExtra(STRING)
        Log.d("Tatsuya ٩( ᐛ )و", "onCreate: $string")
        dataBinding.textView.text = string
    }

    companion object {
        private const val STRING = "string"

        fun createIntent(context: Context, string: String): Intent {
            val intent =  Intent(context, NextActivity::class.java)
            intent.putExtra(STRING, string)
            return intent
        }
    }
}