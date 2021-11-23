package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Pintu:", "onCreate1")
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // Used in put listener on button
       /* binding.button.setOnClickListener(this)*/

        //Observe Live data in MainViewModel
        /*mainViewModel.status.observe(this, {
                binding.textView.text = mainViewModel.status.value
        })*/

        //Part Of data binding
        binding.mainViewModel = mainViewModel

        //Put Listener on a Button
        /*binding.button.setOnClickListener( object : View.OnClickListener{
            override fun onClick(view: View?) {
                Log.d("Pintu:", "Inside Listener")
                mainViewModel.updateName()
            }
        })*/
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val song = listOf("bfdjgbdj")
        binding.recyclerView.adapter = MyAdapter(song)

    }

    override fun onClick(view: View?) {
        /*when(view){
            binding.button->{

            }
        }*/
    }
}