package com.greenmily.profiler

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {

    private  fun resetInput() {
        email_login?.text?.clear()
        ed_password_login?.text?.clear()
    }

    private lateinit var sharedPreferances: SharedPreferances
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sharedPreferances = SharedPreferances(applicationContext)

        btn_login.setOnClickListener{
            val loginEmail = email_login.text.toString()
            val loginPass = ed_password_login.text.toString()
            if (loginEmail.trim().isNotEmpty() && loginPass.trim().isNotEmpty()) {
                val mail = sharedPreferances.getEmail(MainActivity.EMAIL)
                val pass = sharedPreferances.getPassWord(MainActivity.PASSWORD1)
                if (loginEmail == mail && loginPass == pass) {
                    val i = Intent(applicationContext, MainActivity::class.java)
                    startActivity(i)
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Incorrect Details, Please Try Again", Toast.LENGTH_SHORT)
                        .show()
                    resetInput()
                }
            } else {
                Toast.makeText(this, "Please Input your Details", Toast.LENGTH_SHORT).show()
            }
        }
        login_sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}

