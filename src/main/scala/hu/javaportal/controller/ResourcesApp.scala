package hu.javaportal.controller

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{JacksonSwaggerBase, Swagger}

class ResourcesApp (implicit val swagger:Swagger) extends ScalatraServlet with JacksonSwaggerBase
