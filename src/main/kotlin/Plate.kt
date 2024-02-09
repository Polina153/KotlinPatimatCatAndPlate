class Plate(private var food: Int) {

    fun getFood(): Int {
        return food
    }

    fun printInfo() {
        println("plate: $food")
    }

    fun decreaseFood(n: Int) {
        food -= n
    }
}