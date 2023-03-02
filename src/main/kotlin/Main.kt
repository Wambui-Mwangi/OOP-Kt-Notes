fun main(){
   val benz = Car("Mercedes Benz", "E300", "KCC 567V", 0)
    val toyota = Car("Toyota", "Hilux", "KD 760X", 0)
    var car = Car("Mazda", "Demio", "usx 128U", 0) //So classes can be called using capital letters, and vars remain with small letters
    println(benz.speed) //how to access/print the attributes
    println(benz.model)
    benz.start()
    benz.accelerate(acceleration = 45)
    benz.accelerate(acceleration = 72)
    println(benz.speed)

    benz.decelerate(deceleration = 20)
    println(benz.speed)
    benz.hoot()
    benz.stop()
    println(benz.speed)

val myBook = Book("Born a crime", "Trevor Noah", 23, "John Murray")
    println(myBook.author)
    println(calculateStats(arrayOf(23, 57, 46, 89,8)))

}

class Car(var make:String, var model:String, var registration:String, var speed:Int) {
    fun start() {
        println("Vrooom Vrooom")
    }

    fun accelerate(acceleration: Int): Int {  //A function can change an attribute of your object
        speed += acceleration
        return speed //You don't have to retuen, it's useless. Check the decelerate function
    }

    fun decelerate(deceleration: Int) {
        speed -= deceleration
    }

    fun hoot() {
        println("piiii piiiii")
    }

    fun stop() {
        speed -= speed

    }
}
data class Book(var title: String, var author: String, var pages:Int, var publisher:String) //Imagine a function that you want to return multiple values from

data class AgeStats(var maxAge:Int, var minAge:Int, var avg:Double)
fun calculateStats(ages: Array<Int>) :AgeStats{
    val min = ages.min()
    val max = ages.max()
    val avg = ages.average()
    val stats = AgeStats(max,min,avg)
    return stats
}