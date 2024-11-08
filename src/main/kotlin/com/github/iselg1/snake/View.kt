package com.github.iselg1.snake
import pt.isel.canvas.*

/**
 * Generates a new arena with new bricks
 */
fun Game.draw(arena : Canvas) {
    arena.erase()
    arena.drawImage("bricks", this.position.x*32,this.position.y*32,32,32)
}