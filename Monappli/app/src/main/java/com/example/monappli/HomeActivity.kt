package com.example.monappli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        achat_forfait.setOnClickListener {
            val it = Intent(this, AchatActivity::class.java)
            startActivity(it)

        }
    }
        override fun onBackPressed() {
            val alertDialogBuilder = AlertDialog.Builder(this)

            alertDialogBuilder.setTitle("Attention")
            alertDialogBuilder.setIcon(R.drawable.ic_baseline_settings_power_24)
            alertDialogBuilder.setMessage("etes-vous sur de vouloir quitter")
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setPositiveButton("oui"){_,_ ->

                finish()
            }
            alertDialogBuilder.setNegativeButton("non"){_,_ ->
            }
            alertDialogBuilder.setNeutralButton("annuler"){_,_ ->

            }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        
    }


}