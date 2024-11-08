package com.github.iselg1.snake


data class Game(val position: Position)

const val BOARD_WIDTH = 20
const val BOARD_HEIGHT = 16

/**
 * Generates a new brick with a random position
 *
 * @return Bricks coordinates (x,y) given by randomPosition
 */
fun Game.generateNewBrick() : Game {
    return Game(randomPosition())
}


