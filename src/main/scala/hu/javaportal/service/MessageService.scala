package hu.javaportal.service

import hu.javaportal.database.domain.Message
import hu.javaportal.database.persistenceContext._


class MessageService {
  def save(user:String, message:String) = transactional {
    new Message(user, message)
  }

  def list(): List[Message] = transactional {
    all[Message]
  }
}
