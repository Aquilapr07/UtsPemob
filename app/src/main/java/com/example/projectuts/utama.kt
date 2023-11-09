package com.example.projectuts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.utama)

        loadFragment(home())


        //definisi widget
        var buttomnav = findViewById<BottomNavigationView>(R.id.buttomnavview)
        buttomnav.setOnItemSelectedListener {

            when(it.itemId){
                R.id.bot_menu_home -> {
                    loadFragment(home())
                    true
                }
                R.id.bot_menu_bmi -> {
                    loadFragment(kelebihan())
                    true
                }
                R.id.bot_menu_cal -> {
                    loadFragment(cal())
                    true
                }
                R.id.bot_menu_bahaya -> {
                    loadFragment(bahaya())
                    true
                }
                R.id.bot_menu_setting -> {
                    loadFragment(setting())
                    true
                }
                else -> {false}
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.f_countainer,fragment)
        transaction.commit()
    }

}
