package com.github.iselg1.snake
import pt.isel.canvas.*

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






