package app.leftshift.com.exercisewithkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import java.lang.Math.random
import java.util.*

class Practise : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //println(whatShouldIDoToday("happy"))

        val textKey : TextView = findViewById(R.id.tx_stockview) as TextView
        val textValue : TextView = findViewById(R.id.tx_stockview_value) as TextView
        textKey.text = "ABC"

        val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
         val a = spices.filter { it.contains("red")}.sortedBy {it.startsWith('r')}
         textKey.text =  a.toString()

        textKey.text = random().toString()

        textValue.text = {random()}.toString()
    }

    fun mains(args: Array<String>){

        // dayOfWeek()
        //timeOfDay(0..12)
        //var fortune = getFortuneCookie()

        /*println("Your fortune is: {$fortune} ")

        Toast.makeText(this,"Your fortune is: {$fortune}",Toast.LENGTH_LONG).show()
*/
        /*var fortune: String
        for (i in 1..10) {
            fortune = getFortuneCookie()
            println("\nYour fortune is: $fortune")
            if (fortune.contains("Take it easy")) break
        }*/

        //swim(speed = "slow")

        //canAddFish(tankSize = 10.0, currentFish = listOf(3,3,3),fishSize =  2, hasDecoration = true)
    }


    fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
        return when {

            canGoForWalk(mood,weather) -> "go for a walk"

            stayInBed(weather,weather,temperature) -> "stay in bed"

            canGoForSwimming(temperature) ->  "go swimming"

            else -> "Stay home and read."
        }
    }

    private fun canGoForSwimming(temperature: Int): Boolean {
       return  temperature > 35
    }

    private fun stayInBed(mood : String, weather: String, temperature: Int): Boolean {
       return mood == "sad" && weather == "rainy" && temperature == 0
    }

    private fun canGoForWalk(mood : String, weather: String): Boolean {
        return mood == "happy" && weather == "Sunny"
    }

    private fun canAddFish(tankSize : Double, currentFish : List<Int>,
                           fishSize : Int = 2, hasDecoration : Boolean = true) :  Boolean {

      return (tankSize * if (hasDecoration) 0.8 else 1.0 ) >= (currentFish.sum() + fishSize)
    }

    fun swim(speed : String = "fast"){
        println("swimming $speed")
    }
    private fun getFortuneCookie() :String {

        val fortuneCookie = listOf("You will have a great day!",
                "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all   will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

        print("Enter your birthday:")

        val birthday = readLine() ?. toIntOrNull() ?: 1

        return fortuneCookie[birthday.rem(fortuneCookie.size)]
    }

    private fun readLine(fortuneCookie: List<String>): String? {
        return fortuneCookie[Random().nextInt(7)]
    }

    private fun timeOfDay(intRange: IntRange) {
        when (intRange) {
            0..12 -> println("Good morning, Kotlin")
            else -> println("Good night, Kotlin")
        }
    }
}


fun dayOfWeek(){

    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"

        else -> "stopped"
    })
}