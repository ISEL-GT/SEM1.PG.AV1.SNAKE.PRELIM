package com.github.iselg1.snake

/**
 * A main control data class used to save the positions of everything in the game
 * @param snake A snake object containing the position of every one of its parts
 * @param bricks The positions of every brick in the game
 */
data class Game(val snake: Snake?, val bricks: List<Position>)

/**
 * Generates a new brick with a random position
 *
 * @return Bricks coordinates (x,y) given by randomPosition
 */
fun Game.generateNewBrick() : Game {

    // Generates a random position
    val brickPosition = randomPosition()

    // Recursively generates a brick position that hasn't been used yet
    if (brickPosition.exists(this.bricks))
        return this.generateNewBrick()

    // Returns the new brick set made from this new brick position
    val newBrickSet = this.bricks.plus(brickPosition)
    println("Generated new brick at $brickPosition")
    return Game(this.snake, newBrickSet)
}


