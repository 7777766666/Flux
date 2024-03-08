package test

import java.util.function.Consumer

object ConsumerExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val names = listOf("Alice", "Bob", "Charlie")
        val nameConsumer: Consumer<String> = Consumer<String> { it -> println("Hello, $it") }
        names.forEach(nameConsumer)
    }
}