package com.knoldus.user.impl.models

import play.api.libs.json.{Json, OFormat}

case class UpdateRequest(orgId: Int, name: String)

object UpdateRequest {
  implicit val UserUpdateFormatter: OFormat[UpdateRequest] = Json.format[UpdateRequest]
}
