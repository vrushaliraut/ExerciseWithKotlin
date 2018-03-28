package app.leftshift.com.exercisewithkotlin

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : StockActivity(), View.OnClickListener {

    val addition : Int = 0
    var firstInteger : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.txt_kotlin).setText("Hello Welcome to the Kotlin")
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

        var person  = Person("my name is Vrushali",25)

        person.companyLogourl


        person = Person("my name is Vrushali",25,"Engineer")


        //person = Crypto("BT",1000)

        println("Yesterday's Value "+ person.getYersterdaysValue())


        //TODO Null Safety and Smart Casts

        var b : String? = "I can be null"
        b?.length


        //as GeneratorSingletone is a singletones you can not create the instance of this class.

        val tredingUnit = GeneratorSingletone.generatorTredingUnit()


        //TODO infix function use
        val isTrending = tredingUnit isTredingSince tredingUnit.getYersterdaysValue()


        //Named Argument Example
        val isTreding = GeneratorSingletone.isTredingNamedArgument(tredingUnit = tredingUnit, minValue =  23)

        //We can switch the sequence
        val isTreding1 = GeneratorSingletone.isTredingNamedArgument( minValue =  23 , tredingUnit = tredingUnit)

    }

    private fun showToast(name: String, value: Int, isTrue : Boolean = false): Boolean {

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        return true
    }


    override fun onClick(v: View?) {
        /*TODO : - !!
             * 1. ? - This is used for checking null safety
             * 2. !! - This is to check if it's not null, do something else go ahead and throw exception
             *        asserts that an expression is non-null
             * 3. ?: - Elvis Operator
             *       -  takes the right-hand value if the left-hand value is null
             * */

        when(v){
            is TextView -> v.text = "this is text"
            is ImageView -> v.setImageResource(R.drawable.abc_ic_star_black_16dp)
        }
    }
    infix fun TredingUnit.isTredingSince(preval: Int) = getValue() > preval
}
