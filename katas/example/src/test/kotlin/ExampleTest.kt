import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ExampleTest {


    @Test
    fun `should succeed`() {
        X(5) shouldBe X(5)
    }

}


class Boat(x: Int, y: Int, private val direction: Direction) {
    private val coordinates: Coordinates = Coordinates(X(x), Y(y))

    fun computeDirection(island: Island): Direction {
//         if(island.sameY(coordinates)) return direction
        if (island.isHigher(coordinates)) return Direction.NORTH
        if (island.isLower(coordinates)) return Direction.SOUTH
        return direction
    }

}

data class Coordinates(val x: X, val y: Y)

data class X(val value: Int)
data class Y(val value: Int)

@Override
operator fun Y.compareTo(other: Y) = this.value - other.value


class Island(x: Int, y: Int) {
    fun isHigher(coordinates: Coordinates): Boolean {
        return this.y > coordinates.y
    }

    fun isLower(coordinates: Coordinates): Boolean {
        return this.y < coordinates.y
    }

    fun sameY(coordinates: Coordinates): Boolean {
        return coordinates.y == y
    }

    private val x: X;
    private val y: Y;

    init {
        this.x = X(x)
        this.y = Y(y)
    }
}

enum class Direction {
    EAST,
    NORTH,
    SOUTH,
    WEST;

    fun turnRight(): Direction =
        when (this) {
            EAST -> SOUTH
            NORTH -> EAST
            SOUTH -> WEST
            WEST -> NORTH

        }

}
