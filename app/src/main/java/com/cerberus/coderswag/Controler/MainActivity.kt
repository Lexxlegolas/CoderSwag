package com.cerberus.coderswag.Controler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.cerberus.coderswag.Adapters.CategoryAdapter
import com.cerberus.coderswag.Model.Category
import com.cerberus.coderswag.R
import com.cerberus.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        categoryListView.adapter = adapter
    }
}
