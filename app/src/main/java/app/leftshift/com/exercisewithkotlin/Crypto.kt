package app.leftshift.com.exercisewithkotlin

/**
 * Created by vrushali on 3/26/18.
 */
data class Crypto(var name: String, var age: Int) : TredingUnit {

    override fun getTheName(): String {
        return name
    }

    override fun getValue(): Int {
        return age
    }

}