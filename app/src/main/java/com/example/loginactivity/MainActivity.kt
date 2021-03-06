package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    var adapter:LoginAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adapter = LoginAdapter(this, DummyData.cityFacts)
        binding?.factListView?.adapter = adapter
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}