package com.github.iselg1.snake
import pt.isel.canvas.*

/**
 * Draws every brick in the game inside the arena
 */
fun Game.draw(arena : Canvas) {

    for (brick in this.bricks)
        arena.drawImage("bricks", brick.x, brick.y,32,32)
}