package app.leftshift.com.exercisewithkotlin

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val addition : Int = 0
    var firstInteger : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstInteger = 122


        val letter: Char = 'A'    // defining a variable

        //TODO Here you will get Val is unassigned , means Val is immutable

        //letter = 'b'
        println("$letter")

        println("Your Int Value is "+ firstInteger)
        println("Your Int Value is $addition")

        showToast("Hello Kotlin",1)
        showToast("This is 2nd call",1,false)

        // TODO Var - Var is mutable
        var person = Person("my name is Vrushali",25)
        person = Person("my name is Vrushali",25,"Engineer")
    }

    private fun showToast(name: String, value: Int, isTrue : Boolean = false): Boolean {

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        return true
    }

}
