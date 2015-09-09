package hu.javaportal.modules

import hu.javaportal.controller.{ResourcesApp, ChatSwagger, ChatController}

object Controllers extends Services {
  lazy val resourcesApp = wire[ResourcesApp]
  lazy val chatSwagger = wire[ChatSwagger]
  lazy val chatController = wire[ChatController]
}
