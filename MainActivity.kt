package com.example.helloworld

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.lang.System.exit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Привет Android =)", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun exxit(view: View) {
        this.finishAffinity();
    }
}
