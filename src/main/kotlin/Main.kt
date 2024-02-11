fun main(args: Array<String>) {
    val cat:Cat = Cat("Barsik", 7)
    val plate: Plate = Plate(23)
    plate.printInfo()
    cat.printInfo()
    cat.eat(plate)
    plate.printInfo()
    cat.printInfo()

}