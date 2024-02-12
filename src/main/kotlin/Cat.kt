class Cat(private val name: String, private var appetite: Int) {
    private var isHungry: Boolean = appetite > 0

    fun eat(plate:Plate){
       if(plate.getFood() >= appetite)
       {   plate.decreaseFoodOnPlate(appetite)
           appetite = 0
           isHungry = false
       }
       else {
           val tempAppetite = appetite
           appetite -= plate.getFood()
           plate.decreaseFoodOnPlate(tempAppetite)
           isHungry
       }
    }
    fun printInfo() {
        println("$name has appetite $appetite and is hungry: $isHungry")
    }
}