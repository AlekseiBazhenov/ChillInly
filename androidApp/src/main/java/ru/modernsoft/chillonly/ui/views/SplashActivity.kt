package ru.modernsoft.chillonly.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import ru.modernsoft.chillonly.ui.views.StationsActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, StationsActivity::class.java))
    }
}