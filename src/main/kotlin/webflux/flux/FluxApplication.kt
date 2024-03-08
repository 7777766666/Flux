package webflux.flux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@MemSpringBootApplication
class FluxApplication

fun main(args: Array<String>) {
    runApplication<FluxApplication>(*args)
}
