package app

import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLDivElement

object MainApp {

  def appElement(): ReactiveHtmlElement[HTMLDivElement] = {
    div(
      className := "flex items-center justify-center h-screen",
      div(
        className := "card bg-base-100 shadow-xl w-96",
        div(
          className := "card-body",
          h2(className := "card-title", "Scala.js + daisyUI"),
          div(
            className := "card-actions justify-end",
            button(className := "btn btn-primary", "Primary"),
            button(className := "btn btn-ghost", "Ghost")
          )
        )
      )
    )
  }
}