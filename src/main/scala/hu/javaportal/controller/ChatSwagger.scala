package hu.javaportal.controller

import org.scalatra.swagger.{ApiInfo, Swagger}

object ChatApiInfo extends ApiInfo(
  title = "Chat API",
  description = "This is a simple global chat",
  termsOfServiceUrl = "TOS",
  contact = "janos.haber@finesolution.hu",
  license = "MIT",
  licenseUrl = "http://opensource.org/licenses/MIT"
)

class ChatSwagger extends Swagger(Swagger.SpecVersion, "1.0.0",ChatApiInfo)
