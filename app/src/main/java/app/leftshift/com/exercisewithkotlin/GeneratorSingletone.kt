package app.leftshift.com.exercisewithkotlin

//TODO singletons example
object GeneratorSingletone {

    fun generatorTredingUnit(): TredingUnit{

        //TODO If else
        val randomNumber = if(Math.random() > 0.2) 1 else 2


        when(randomNumber){
            in 0..5 -> return  Crypto("name", 445)
            else -> return  Crypto("XRP", 1250)
        }

    }

    fun forLoop(){

        val arrayOfInts = intArrayOf(1, 2, 3, 4, 5)

        for ((index,int) in arrayOfInts.withIndex()){
            //do something
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
