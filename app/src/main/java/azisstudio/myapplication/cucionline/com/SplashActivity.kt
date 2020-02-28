package azisstudio.myapplication.tokoonline.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class SplashActivity : AppCompatActivity() {

    //deklarsi
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btnLogin = findViewById(R.id.btn_masuk)

        btnLogin.setOnClickListener {

            val linkToHome = Intent(this,HomeActivity::class.java)
            startActivity(linkToHome)
        }
    }
}
