package hu.javaportal.database.migration

import hu.javaportal.database.domain.Message
import hu.javaportal.database.persistenceContext
import net.fwbrasil.activate.migration.Migration

import persistenceContext._
class CreateMessage extends Migration {
  def timestamp = 20150909001l

  def up: Unit = {
    table[Message]
      .createTable(
        _.column[String]("user"),
        _.column[String]("message")
      )
  }

}
