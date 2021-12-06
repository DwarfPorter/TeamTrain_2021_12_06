package ru.geekbrains.teamtrain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//New comment
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.text_hello)
    }
}
