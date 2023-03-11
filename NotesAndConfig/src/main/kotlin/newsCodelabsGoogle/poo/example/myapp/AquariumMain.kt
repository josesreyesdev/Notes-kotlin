package newsCodelabsGoogle.poo.example.myapp

fun main() {
    //buildAquarium()

    //makeFish()

    makeFish2()
}

fun buildAquarium() {
    //val myAquarium  = Aquarium()
    //myAquarium.printSize()

    //default height and length
    //val aquarium2 = Aquarium(width = 25)
    //aquarium2.printSize()

    //default width
    //val aquarium3 = Aquarium(height = 35, length = 110)
    //aquarium3.printSize()

    //everything custom
    //val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    //aquarium4.printSize()

    //val aquarium5 = Aquarium( numberOfFish = 29)
    //aquarium5.printSize()

    val aquarium6 = Aquarium( length = 25, width = 25, height = 40)
    aquarium6.printSize()

    println()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark color: ${shark.color}")
    shark.eat()
    println()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()
}

fun makeFish2() {
    val shark2 = Shark2()
    val pleco2 = Plecostomus2( eatFood = "Lettuce" )

    println("Shark color: ${shark2.color}")
    shark2.eat()
    println()
    println("Plecostomus color: ${pleco2.color}")
    pleco2.eat()
}