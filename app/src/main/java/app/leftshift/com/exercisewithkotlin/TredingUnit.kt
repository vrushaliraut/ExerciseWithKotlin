package app.leftshift.com.exercisewithkotlin

/**
 * Created by vrushali on 3/26/18.
 */
interface TredingUnit{

    fun getTheName() : String

    fun getValue() : Int

    fun getYersterdaysValue() : Int{
        return getValue() * 2
    }


    infix fun TredingUnit.isTredingSince(preval: Int) = getValue() > preval
}