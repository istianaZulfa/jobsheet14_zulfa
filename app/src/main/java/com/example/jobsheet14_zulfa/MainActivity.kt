package com.example.jobsheet14_zulfa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)

        btn1.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment)
            fragmentTransaction.commit()
        }

        btn2.setOnClickListener{
            val fragmentTransaction= supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment2)
            fragmentTransaction.commit()
        }

        btn3.setOnClickListener{
            val fragmentTransaction= supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment3)
            fragmentTransaction.commit()
        }

        btn4.setOnClickListener{
            val fragmentTransaction= supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,BlankFragment4)
            fragmentTransaction.commit()
        }

        btn5.setOnClickListener{
            val fragmentTransaction= supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment5)
            fragmentTransaction.commit()
        }
    }
}

private fun Any.replace(fragmentContainer: Int, btn1: Button?) {

}
