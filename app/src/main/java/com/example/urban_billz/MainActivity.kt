package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.viewmodel.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.urban_billz.PersonsData
import com.example.urban_billz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
//        displayContacts()

    }
    fun displayBills(){

       val name1=PersonsData("Orishaba Mercy","o7898847763")
        var name2 =PersonsData(" Hope Amutu","0789567896","hopeline@gmail.com",)
        var name3=PersonsData("Linet Kamara ","0078967989","klinet@gmail.com")
        var name4=PersonsData(" Bridget Nakakande","0789678945","nakakande@gmail.com")
        var name5 =PersonsData("Cithia Namputu","07896789","cythiana@gmail.com")
        var names = listOf(name1,name2,name3,name4,name5)
        val contactAdapter=BillRVAdapter(names)
        binding.rvAdapter.layoutManager =LinearLayoutManager(this)
        binding.rvAdapter.adapter= BillRVAdapter

    }
}










