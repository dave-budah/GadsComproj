package com.davebudah.gadscomproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davebudah.gadscomproj.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splashscreen.*

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        splashImage.alpha = 0f
        splashImage.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}