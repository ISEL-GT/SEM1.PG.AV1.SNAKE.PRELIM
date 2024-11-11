package com.github.iselg1.snake
import kotlin.jvm.internal.Ref.BooleanRef
import kotlin.random.Random

data class Position(val x: Int, val y: Int)


/**
 * Checks if the positional values between this and another position are the same
 * @param position Any other position to compare this one to
 */
fun Position.isEqual(position: Position) : Boolean {
    return this.x == position.x && this.y == position.y
}

/**
 * Checks if this position exists anywhere inside the given list
 * @param positions A list of positions to check the for the existence of this one
 */
fun Position.exists(positions: List<Position>) : Boolean{

    for (position in positions)
        if (position.isEqual(this)) return true;

    return false;
}

/**
 * Generates a new random position between 0 and the constants of the board
 *
 * @return A random coordinate position (x,y)
 */
fun randomPosition(): Position {

    // generate x in [0..Constant_BOARD_WIDTH]
    val x = Random.nextInt(0, BOARD_WIDTH)

    // generate y in [0..Constant_BOARD_HEIGHT]
    val y = Random.nextInt(0, BOARD_HEIGHT)

    return Position(x* SQUARE_DIMENSIONS, y* SQUARE_DIMENSIONS)
}
