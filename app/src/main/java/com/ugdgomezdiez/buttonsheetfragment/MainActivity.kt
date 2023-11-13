package com.ugdgomezdiez.buttonsheetfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.ugdgomezdiez.buttonsheetfragment.fragment.ButtomFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val button = findViewById<AppCompatButton>(R.id.btmShowSheet)
        button.setOnClickListener {
            val fragment = ButtomFragment()
            fragment.show(supportFragmentManager, "Unai")
        }
    }
}