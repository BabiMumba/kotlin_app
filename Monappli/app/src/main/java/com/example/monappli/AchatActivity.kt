package com.example.monappli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.monappli.Fragment.AfricellFragment
import com.example.monappli.Fragment.AirtelFragment
import com.example.monappli.Fragment.OrangeFragment
import com.example.monappli.Fragment.VodacomFragment
import kotlinx.android.synthetic.main.activity_achat.*
import kotlinx.android.synthetic.main.alert_builder.*

@Suppress("DEPRECATION")

class AchatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achat)
        val airtelfrag = AirtelFragment()
        val vodacomfragment = VodacomFragment()
        val afrcricellFrag = AfricellFragment()
        val orange = OrangeFragment()

        makecurrent(airtelfrag)

        navigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.airtel -> makecurrent(airtelfrag)
                R.id.orange -> makecurrent(orange)
                R.id.vodacom -> makecurrent(vodacomfragment)
                R.id.africell -> makecurrent(afrcricellFrag)

            }
            true



        }







        /*forfait_appelle.setOnClickListener {
            customAlertDialog()
        }


    }
    private fun customAlertDialog() {
        val factory = LayoutInflater.from(this)
        val dialogView: View = factory.inflate(R.layout.alert_builder, null)
        val dialog = AlertDialog.Builder(this).create()
        dialog.setView(dialogView)
        dialog.setCancelable(false)
        dialog.setTitle("BENEFICIAIRE")
        dialog.setIcon(R.drawable.ecommerce)
        dialogView.findViewById<View>(R.id.confirmer).setOnClickListener {

            Toast.makeText(this, "veuillez patienter vous allez recevoir un message", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }


        dialogView.findViewById<View>(R.id.annuler).setOnClickListener { dialog.dismiss() }
        dialog.show()
    }
    fun customiser(){
        val dialog = AlertDialog.Builder(this).create()
        dialog.setIcon(R.drawable.ic_baseline_compte)
        dialog.setTitle("babistone")
        dialog.setMessage("bienvenue sur mon application android")
        dialog.show()
*/
    }

    private fun makecurrent(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout,fragment)
            commit()
        }

}