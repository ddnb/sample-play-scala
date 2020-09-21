package controllers

import javax.inject._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

class SampleController @Inject()(mcc: MessagesControllerComponents)
  extends MessagesAbstractController(mcc) {

  def helloworld() = Action {
    implicit request: MessagesRequest[AnyContent] => Ok("Hello World")
  }
}
