package azisstudio.myapplication.tokoonline.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kita buat object handle yang delay
        val handler = android.os.Handler()

        //kita aktifkan fundelay
        handler.postDelayed(Runnable {
            //intent di aktifkan
            val intent = Intent(this,SplashActivity::class.java)
            //aktifkan Intent
            startActivity(intent)
        }, 5000)


    }
}
