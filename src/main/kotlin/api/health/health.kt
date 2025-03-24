package challenge.api.health

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.health() {
    get("/ping") { call.respondText("pong ;)") }
}
