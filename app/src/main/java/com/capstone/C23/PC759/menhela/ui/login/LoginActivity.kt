package com.capstone.c23.pc759.menhela.ui.login
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.capstone.c23.pc759.menhela.R

class LoginActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi elemen tampilan
        usernameEditText = findViewById(R.id.username_login)
        passwordEditText = findViewById(R.id.pass_login)
        loginButton = findViewById(R.id.btn_login)
        registerButton = findViewById(R.id.btn_regist)

        // Tambahkan logika login saat tombol ditekan
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Lakukan verifikasi login di sini, misalnya dengan memanggil API endpoint
            // dan menangani hasilnya sesuai dengan kebutuhan aplikasi Anda.
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}