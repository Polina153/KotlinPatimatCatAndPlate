class Plate(private var food: Int) {

    fun getFood(): Int {
        return food
    }

    fun printInfo() {

        println("plate: $food")
    }

    fun decreaseFoodOnPlate(n: Int):Int {
         if(food > n) food -= n
            else { food }
        return food

    }
}