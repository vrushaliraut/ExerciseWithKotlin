package app.leftshift.com.exercisewithkotlin

import android.util.Log

/**
 * Created by vrushali on 3/25/18.
 */
class Person(name: String, age: Int) : TredingUnit {

    var companyLogourl : String = "google.com/image"

    override fun getTheName(): String {
        return getTheName()
    }

    override fun getValue(): Int {
        return getValue()
    }

    //Primary constructor
    constructor(name: String, age: Int, jobTitle: String) : this(name, age) {
        //initailize
    }

    init {
        Log.d("TAG", "My name is: " + name)
    }
}