fun main(args: Array<String>) {
    val cat:Cat = Cat("Barsik", 9)
    val plate: Plate = Plate(29)
    plate.printInfo()
    cat.printInfo()
    cat.eat(plate)
    plate.printInfo()
    cat.printInfo()
    val cat2 = Cat("Murzik",29)
    cat2.eat(plate)
    plate.printInfo()
    cat2.printInfo()
}