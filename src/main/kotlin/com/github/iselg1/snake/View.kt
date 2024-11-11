package com.github.iselg1.snake
import pt.isel.canvas.*

/**
 * Generates a new arena with new bricks
 */
fun Game.draw(arena : Canvas) {

    for (brick in this.bricks)
        arena.drawImage("bricks", brick.x, brick.y,32,32)
}