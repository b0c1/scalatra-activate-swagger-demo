package hu.javaportal.database.domain

import net.fwbrasil.activate.entity.Entity

case class Message (var user:String, var message:String) extends Entity
