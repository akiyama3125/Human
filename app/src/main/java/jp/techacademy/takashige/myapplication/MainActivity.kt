package jp.techacademy.takashige.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Human("a", 20, "歩く")
        a.say()
        val b = Human("a", 20, "走る")
        b.think()
    }
}