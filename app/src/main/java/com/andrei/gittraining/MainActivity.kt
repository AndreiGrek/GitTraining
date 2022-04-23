package com.andrei.gittraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //Коммит для мастера
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Коммент номер 2 для ветки fourth_branch и мержим её в мастер
    }
}