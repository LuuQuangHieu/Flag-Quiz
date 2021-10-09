package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN    //set no status bar

        //setContentView(R.layout.activity_main)    //old way
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)  //binding way

        binding.btStart.setOnClickListener{
            if (binding.etName.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                //Consider it like putting the from and to address on the envelope you are about to
                // mail. The "::" gets the class reference and the ".java" version of it (since
                // Intent needs the Java form)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())

                startActivity(intent)
                finish()    //close the current activity
            }
        }


    }
}