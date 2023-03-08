package newsCodelabsGoogle.poo.example.myapp

fun main() {
    buildAquarium()
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

    val aquarium5 = Aquarium( numberOfFish = 29)
    aquarium5.printSize()
}