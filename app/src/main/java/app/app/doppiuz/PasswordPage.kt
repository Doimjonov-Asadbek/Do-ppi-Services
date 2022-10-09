package app.app.doppiuz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PasswordPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_password_page)
    }
}