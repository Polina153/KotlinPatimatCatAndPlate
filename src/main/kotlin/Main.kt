fun main(args: Array<String>) {
    val cat:Cat = Cat("Barsik", 0)
    val plate: Plate = Plate(20)
    plate.printInfo()
    cat.printInfo()
    cat.eat(plate)
    plate.printInfo()
    cat.printInfo()
}