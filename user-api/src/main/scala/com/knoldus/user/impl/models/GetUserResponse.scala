package com.knoldus.user.impl.models

import play.api.libs.json.{Json, OFormat}

case class GetUserResponse(details: Option[UserDetails], message: Option[String])

object GetUserResponse {
  implicit val GetUserResponseFormatter: OFormat[GetUserResponse] = Json.format[GetUserResponse]
}
