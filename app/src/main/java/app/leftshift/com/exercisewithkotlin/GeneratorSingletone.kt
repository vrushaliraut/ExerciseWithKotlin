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
}