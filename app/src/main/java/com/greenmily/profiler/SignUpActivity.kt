package com.greenmily.profiler

import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class SignUpActivity: AppCompatActivity() {

    private fun resetInput() {
        editText5?.text?.clear()
        editText6?.text?.clear()
        editText2?.text?.clear()
        editText3?.text?.clear()
        editText4?.text?.clear()
    }

    private lateinit var sharedPreferances: SharedPreferances
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        sharedPreferances = SharedPreferances(applicationContext)
        button.setOnClickListener{
            val fName = editText5.text.toString()
            val mail = editText6.text.toString()
            val pass = editText2.text.toString()
            val confirmPass = editText3.text.toString()
            val phoneNum = editText4.text.toString()

            if (fName.isEmpty() || mail.isEmpty() || pass.isEmpty() || confirmPass.isEmpty() || phoneNum.isEmpty() ) {
                Toast.makeText(this, "Fill in all fields to register", Toast.LENGTH_SHORT).show()
                resetInput()
            } else if (sharedPreferances.getEmail(MainActivity.EMAIL) == mail) {
                Toast.makeText(this, "Email already exists", Toast.LENGTH_SHORT).show()
                resetInput()
            } else {
                sharedPreferances.fullName(MainActivity.FULLNAME, fName)
                sharedPreferances.eMail(MainActivity.EMAIL, mail)
                sharedPreferances.passWord(MainActivity.PASSWORD1, pass)
                sharedPreferances.confirmPassWord(MainActivity.PASSWORD2, confirmPass)
                sharedPreferances.phoneNumber(MainActivity.NUMBER, phoneNum)
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
                finish()
            }

        }

    }
}
