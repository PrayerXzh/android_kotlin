package com.example.xlwapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xlwapp.R

//Retrofit:java与http之间的接口
//moshi:转换Json的工具
class GetOnlineDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_online_data)
    }
}
