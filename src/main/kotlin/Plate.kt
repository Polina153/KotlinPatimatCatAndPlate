class Plate(private var food: Int) {

    fun getFood(): Int {
        return food
    }

    fun printInfo() {
        println("plate: $food")
    }

    fun decreaseFoodOnPlate(n: Int):Int {
        return when(food > n) {
            true -> (food - n)
            else -> food
        }
    }
}