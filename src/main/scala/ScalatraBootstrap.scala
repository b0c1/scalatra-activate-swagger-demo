import javax.servlet.ServletContext

import hu.javaportal.modules.Controllers
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext): Unit = {
    context.mount(Controllers.resourcesApp, "/chat-api")
    context.mount(Controllers.chatController, "/chat")
  }
}
