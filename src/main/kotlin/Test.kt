import kotlinx.coroutines.*
suspend fun main() = coroutineScope{
    var Dog = Dog()
    GlobalScope.launch{
        println("Введите число:")
        var n = readln()!!.toByte()
        for(i in 0..n){
            delay(1000L)
            Dog.careDog()
        }
        Dog.bodyMassIndex()
        runBlocking{
            delay(2000L)
        }
    }
}