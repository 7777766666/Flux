package test

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration


fun main(args: Array<String>) {

    val monoEmpty: Mono<String> = Mono.empty()
    val fluxEmpty: Flux<String> = Flux.empty()

    val monoJust: Mono<Int> = Mono.just(55)
    val monoJust1 = Mono.just(6)
    val flux = Flux.just(10, 18, 1000)

    monoJust.subscribe(
        { value -> println("Value is ${value}") },
        { error -> println("Error: ${error}") },
        { println("Stream finish") }
    )

    val block = monoJust1.block()
    println("Just2 is $block !")

    val fluxFromMono = monoJust.flux()
    val booleanMono = flux.any { it > 77 }
    val resultBool = booleanMono.block()
    println("boolean is $resultBool")

    val rangeFlux = Flux.range(10, 5).subscribe(System.out::println)
    Flux.fromIterable(listOf(2, 5, 9)).subscribe(System.out::println)

    Flux.generate<String> { it ->

        it.next("hello")

    }
        .delayElements(Duration.ofMillis(1666))
        .take(4)
        .subscribe { it -> println(it) }

    Thread.sleep(4444)
}
