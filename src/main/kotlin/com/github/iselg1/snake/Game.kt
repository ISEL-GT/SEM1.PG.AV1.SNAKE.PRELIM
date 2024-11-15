package com.github.iselg1.snake

/**
 * A main control data class used to save the positions of everything in the game
 * @param snakeParts A list of snake objects
 * @param bricks The positions of every brick in the game
 * @param direction The direction that the user wants to move to
 */
data class Game(val snakeParts: ArrayList<Snake>, val bricks: ArrayList<Position>, val direction: Direction)

/**
 * Generates a new brick with a random position
 *
 * @return Bricks coordinates (x,y) given by randomPosition
 */
fun Game.generateNewBrick(): Game {

    // Generates a random position
    val brickPosition = randomPosition()
    val snakePositions = this.snakeParts.map { snake -> snake.position }

    // Recursively generates a brick position that hasn't been used yet
    if (brickPosition.exists(this.bricks) || brickPosition.exists(snakePositions))
        return this.generateNewBrick()

    // Returns the new brick set made from this new brick position
    this.bricks.add(brickPosition)
    return Game(this.snakeParts, this.bricks, this.direction)
}

/**
 * Updates the internal list of Snake parts
 * @param snakeParts A list of Snake objects
 */
fun Game.updateSnake(snakeParts: ArrayList<Snake>) {
    game.snakeParts.clear()
    snakeParts.forEach { part -> game.snakeParts.add(part) }
}