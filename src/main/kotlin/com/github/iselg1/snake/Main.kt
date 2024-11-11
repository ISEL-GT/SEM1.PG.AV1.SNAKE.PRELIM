package com.github.iselg1.snake
import pt.isel.canvas.*

// The different ticking values for both the snake and brick actions
const val SNAKE_TICKS = 250
const val BRICK_TICKS = 5*1000

// The width of the board measured in grid squares
const val BOARD_WIDTH = 20
const val BOARD_HEIGHT = 16
const val TOTAL_SQUARES = BOARD_HEIGHT * BOARD_WIDTH

// The size in pixels of one of the square's sides
const val SQUARE_DIMENSIONS = 32

// The main arena and game where everything will be drawn on
val arena = Canvas(BOARD_WIDTH* SQUARE_DIMENSIONS, BOARD_HEIGHT* SQUARE_DIMENSIONS, BLACK)
var game = Game(Snake(Position(0,0)), ArrayList())

fun main() {

    onStart {

        // Ticks once so the first brick appears
        onBrickTick()

        // Starts the ticking process for both the snake and the brick
        arena.onTimeProgress(SNAKE_TICKS) { onSnakeTick() }
        arena.onTimeProgress(BRICK_TICKS) { onBrickTick() }
    }

}

/**
 * Fired whenever a brick drawing event occurs.
 * Clears the arena and draws a new brick in a new place.
 */
fun onBrickTick() {

    // Checks if all the squares have been filled, and if so, stops generating them
    if (game.bricks.size == TOTAL_SQUARES) return;

    // Generates a new brick and draws it on screne
    game = game.generateNewBrick()
    game.draw(arena)
}

fun onSnakeTick() { }

