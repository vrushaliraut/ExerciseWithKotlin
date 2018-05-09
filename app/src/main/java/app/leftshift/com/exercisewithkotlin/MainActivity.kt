package app.leftshift.com.exercisewithkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.leftshift.com.exercisewithkotlin.R.id.tx_kotlin
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tx_kotlin.text = "hello Kotlin"
    }

}
