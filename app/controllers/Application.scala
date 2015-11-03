package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    val posts = List("Hello, my name is Clarissa! :)")

    Ok(views.html.index(posts))
  }

}
