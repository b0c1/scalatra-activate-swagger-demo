package hu.javaportal.modules

import com.softwaremill.macwire.Macwire
import hu.javaportal.service.MessageService

trait Services extends Macwire {
  lazy val messageService = wire[MessageService]
}
