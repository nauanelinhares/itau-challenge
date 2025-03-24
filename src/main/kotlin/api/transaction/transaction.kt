package challenge.api.transaction

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

data class Transaction(val amount: Double, val date: String)

fun Route.transaction() {
    post("/transaction") {
        println("transaction")

        val transaction = call.receive<Transaction>()
        call.respondText(transaction.amount.toString(), status = HttpStatusCode.Created)
    }
}
