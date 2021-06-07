package com.example.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private val tvLogStatus : TextView by lazy { findViewById(R.id.tvLogStatus) }

    private val mFirebaseAuth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (mFirebaseAuth.currentUser == null) {
            tvLogStatus.text = getString(R.string.logged_out)
        } else {
            tvLogStatus.text = getString(R.string.logged_in)
        }

    }



}