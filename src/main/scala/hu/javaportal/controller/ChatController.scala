package hu.javaportal.controller

import hu.javaportal.service.MessageService
import org.scalatra.swagger.{Swagger, SwaggerSupport}

case class MessageFromUser(user: String, message: String)

class ChatController(implicit val swagger: Swagger, messageService: MessageService) extends RestController with SwaggerSupport {
  protected val applicationDescription = "This is the application description blablabla"

  val listOperation = (apiOperation[List[MessageFromUser]]("listChat")
    summary ("List all existing chat message")
    notes ("Blablabla messages blablabla"))

  val saveOperation = (apiOperation[Unit]("saveMessage")
    summary ("Save the message")
    parameters (
    bodyParam[MessageFromUser]
    ))

  get("/", operation(listOperation)) {
    messageService.list().map(msg => MessageFromUser(msg.user,msg.message))
  }

  post("/", operation(saveOperation)) {
    parsedBody.extractOpt[MessageFromUser] match {
      case Some(MessageFromUser(user, message)) => messageService.save(user, message)
        "OK"
      case _ => halt(400)
    }
  }
}
