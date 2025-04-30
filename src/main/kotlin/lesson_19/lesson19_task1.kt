package org.example.lesson_19

fun main() {
    println("Список рыб, которые Вы можете добавить в свой аквариум:")

    Fish.entries.forEach {
        println("- ${it.info()}")
    }
}

enum class Fish {
    GUPPY {
        override fun info(): String {
            return "гуппи"
        }
    },
    ANGEL_FISH {
        override fun info(): String {
            return "скалярия"
        }
    },
    GOLD_FISH {
        override fun info(): String {
            return "золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun info(): String {
            return "петушок"
        }
    };

    abstract fun info(): String
}