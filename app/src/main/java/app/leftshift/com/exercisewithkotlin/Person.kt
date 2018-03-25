package app.leftshift.com.exercisewithkotlin

import android.nfc.Tag
import android.util.Log

/**
 * Created by vrushali on 3/25/18.
 */
class Person(name : String, age : Int){
                                                             //Primary constructor
    constructor(name : String, age : Int, jobTitle: String): this(name,age){
        //initailize
    }

    init {
        Log.d("TAG","My name is: "+ name)
    }
}