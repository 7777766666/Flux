package model

class Greeting {
    var message: String? = null

    constructor()
    constructor(message: String?) {
        this.message = message
    }

    override fun toString(): String {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}'
    }
}