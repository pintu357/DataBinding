package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Pintu:", "onCreate1")
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button.setOnClickListener(this)

        mainViewModel.status.observe(this, {
                binding.textView.text = mainViewModel.status.value
        })

        binding.mainViewModel = mainViewModel
        /*binding.button.setOnClickListener( object : View.OnClickListener{
            override fun onClick(view: View?) {
                Log.d("Pintu:", "Inside Listener")
                mainViewModel.updateName()
            }
        })*/
    }

    override fun onClick(view: View?) {
        when(view){
            binding.button->{

            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Pintu:", "onStart1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Pintu:", "onResume1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Pintu:", "onPause1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Pintu:", "onStop1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Pintu:", "onDestroy1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Pintu:", "onRestart1")
    }
}