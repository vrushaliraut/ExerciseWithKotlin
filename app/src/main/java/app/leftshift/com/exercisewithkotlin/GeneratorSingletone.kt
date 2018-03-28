package app.leftshift.com.exercisewithkotlin

//TODO singletons example
object GeneratorSingletone {

    fun generatorTredingUnit(): TredingUnit{
        val randomNumber = Math.random()

        when(randomNumber){
            in 0..5 -> return  Crypto("name", 445)
            else -> return  Crypto("XRP", 1250)
        }
    }

    //TODO  this is one way 2. Extension function
    /*fun isTredingUp(tredingUnit: TredingUnit): Boolean{
        return  tredingUnit.getValue() > tredingUnit.getYersterdaysValue()
    }*/


    //TODO another way - 1. Single expression function

    fun isTredingUp(tredingUnit: TredingUnit) =
            tredingUnit.getValue() > tredingUnit.getYersterdaysValue()


    fun isTredingNamedArgument(tredingUnit: TredingUnit,
                               comparator: Comparator<TredingUnit>? = null,
                               forceTredingUp : Boolean = false ,
                               minValue: Int = -100,
                               maxValue: Int = 334) =
            tredingUnit.getValue() > tredingUnit.getYersterdaysValue()



}
