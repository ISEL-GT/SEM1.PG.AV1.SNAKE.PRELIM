package com.github.iselg1.snake
import kotlin.random.Random

data class Position(val x: Int, val y: Int)

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

    return Position(x, y)
}

