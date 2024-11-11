package com.github.iselg1.snake
import pt.isel.canvas.*

// The different ticking values for both the snake and brick actions
const val SNAKE_TICKS = 250
const val BRICK_TICKS = 5*10

// The width of the board measured in grid squares
const val BOARD_WIDTH = 20
const val BOARD_HEIGHT = 16

// The size in pixels of one of the square's sides
const val SQUARE_DIMENSIONS = 32

// The main arena and game where everything will be drawn on
val arena = Canvas(BOARD_WIDTH* SQUARE_DIMENSIONS, BOARD_HEIGHT* SQUARE_DIMENSIONS, BLACK)
var game = Game(Snake(Position(0,0)), ArrayList())

fun main() {

    onStart {
        val arena = Canvas(640, 512, BLACK)
        var game = Game(Position(100, 100))

        arena.onTimeProgress(250) {
            game = game.generateNewBrick()
            game.draw(arena)
        }
    }

}

/**
 * Fired whenever a brick drawing event occurs.
 * Clears the arena and draws a new brick in a new place.
 */
fun onBrickTick() {
    game = game.generateNewBrick()
    game.draw(arena)
}

fun onSnakeTick() { }




