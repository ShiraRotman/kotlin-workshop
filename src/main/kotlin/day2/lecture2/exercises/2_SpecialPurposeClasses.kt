package day2.lecture2.exercises


/**
 * Create a singleton class named "Counter" the class should have
 *
 *   1. private mutable variable [Int] named [counter] with a starting value of 0
 *   2. a single line function called [currentCount] which returns the value of [counter]
 *   3. a function called [increment] which adds 1 to the [counter] variable
 *
*/

//__________________Write your singleton here______________
object Counter
{
    var counter=0
        private set(value) { field=value }
    //fun currentCount()= counter;
    fun increment() { counter++; }
}

/**
 * Create an enum class named "SolarSystem" the class needs to be filled with the following information
 *
 *
 * Mercury
 * Venus
 * Earth
 * Mars
 * Jupiter
 * Saturn
 * Uranus
 * Neptune
 *
 * EXTRA: add a radius parameter to the enum class and fill the stars with the radius
 *
 * Mercury = 2,439.7
 * Venus = 6,051.8
 * Earth = 6,371
 * Mars = 3,389.5
 * Jupiter = 69,911
 * Saturn = 58,232
 * Uranus = 25,362
 * Neptune = 24,622
 */

//__________________Write your enum class here______________
enum class SolarSystem(val radius: Double)
{
    Mercury(2439.7),
    Venus(6051.8),
    Earth(6371.0),
    Mars(3389.5),
    Jupiter(69911.0),
    Saturn(58232.0),
    Uranus( 25362.0),
    Neptune(24622.0)
}


/**
 * Write a sealed class named State
 * with four sub classes
 *
 * [Idle]
 * [Loading]
 * [Completed]
 * [Error]
 */

//__________________Write your sealed class here______________
sealed class State
class Idle : State()
class Loading : State()
class Completed: State()
class Error : State()