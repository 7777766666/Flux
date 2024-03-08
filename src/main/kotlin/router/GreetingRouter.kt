//package router
//
//import handler.GreetingHandler
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.http.HttpMethod.GET
//import org.springframework.web.reactive.function.server.RouterFunction
//import org.springframework.web.reactive.function.server.RouterFunctions
//import org.springframework.web.reactive.function.server.ServerResponse
//
//@Configuration(proxyBeanMethods = false)
//class GreetingRouter(greetingHandler: GreetingHandler) {
//
//    @Bean
//    fun route(greetingHandler: GreetingHandler) : RouterFunctions {
//        return RouterFunctions.route(GET("hello"))
//    }
//}