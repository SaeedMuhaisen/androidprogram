package com.example.recyclerviewexinclass

//import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.recyclerviewexinclass.authentication.CreateAccountFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.settings -> {
                Toast.makeText(this,"You clicked me",Toast.LENGTH_LONG).show()
                setContentView(R.layout.settings)
                return true
            }
            R.id.sign_out -> {
                Toast.makeText(this,"You clicked me",Toast.LENGTH_LONG).show()
                setContentView(R.layout.fragment_main_screen)

                return true
            }
            R.id.profile -> {
                Toast.makeText(this,"You clicked me",Toast.LENGTH_LONG).show()
                setContentView(R.layout.fragment_main_screen)
                return true
            }
            else->super.onOptionsItemSelected(item)
        }

    }
}



