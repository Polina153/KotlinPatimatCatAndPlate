class Cat(private val name: String, private var appetite: Int) {
    private var isHungry: Boolean = appetite > 0

    fun eat(plate:Plate){
        plate.decreaseFood(appetite)
        isHungry = false
        appetite = 0
    }
    fun printInfo() {
        println("$name has appetite $appetite and is hungry: $isHungry")
    }
}