package day3.lecture1.exercises

/**
 *
 * 1.		Create a class BaseBuildingMaterial with a property numberNeeded that is set to 1.
 * 			You always need 1 of the base material.
 *
 * 			Create two subclasses, Wood and Brick.
 * 			For BaseBuildingMaterial you need 4 units of wood or 8 units of brick.
 *
 * 			Now you have a type hierarchy.
 *
 * 			Create a generic class Building that can take any building material as its argument, and only building materials.
 *
 * 			A building always requires 100 base materials.
 * 			Add a property baseMaterialsNeeded and set it to 100.
 *
 * 			Add another property, actualMaterialsNeeded and use a one-line function to calculate this from numberNeeded of the passed-in material.
 *
 * Bonus:	Add a method build() that prints the type and number of materials needed.
 * 			Hint: Use reflection to get the class and simple name: instance::class.simpleName
 * 			Create a main function and make a building using Wood.
 * 			If you did this correctly, running main() will print something like “400 Wood required”.
 *
 * 2.		Look at your code, consider whether it can be an in type or an out type.
 *
 * 3.		Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding,
 * 			which takes a Building with a building material T as an argument.
 * 			If the materials needed are less than 500, print "small building", otherwise, print "large building".
 *
 */
open class BaseBuildingMaterial(val numberNeeded: Int=1)
{
    companion object
    {
        fun <T: Building<BaseBuildingMaterial>> isSmallBuilding(building: T)
        {
            if (building.actualMaterialsNeeded<500) println("small building")
            else println("large building")
        }
    }
}

class Wood: BaseBuildingMaterial(4)
class Brick: BaseBuildingMaterial(8)

class Building<out T: BaseBuildingMaterial>(val material: T)
{
    val baseMaterialsNeeded=100
    val actualMaterialsNeeded=baseMaterialsNeeded*material.numberNeeded
    fun build() { println("$actualMaterialsNeeded ${material::class.simpleName} required") }
}

fun main() {
    //Write your code below this line
    val building=Building(Wood())
    building.build()
}