package app.leftshift.com.exercisewithkotlin

import android.nfc.Tag
import android.util.Log

/**
 * Created by vrushali on 3/25/18.
 */
class Person(name : String, val age : Int, var jobTitle: String= ""){


    init {
        Log.d("TAG","My name is: "+ name)
    }

    /*
        1. making var jobTitle - help to change jobTitle in whole class
        2. making val as age - val is immutable, as we are not assigning new value of age
     */

    fun changeJob(newJob: String){
        jobTitle = newJob
        var newAge = 21 + age
    }
}