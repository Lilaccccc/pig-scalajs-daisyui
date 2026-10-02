import com.raquo.laminar.api.L.*
import org.scalajs.dom

import app.MainApp

@main
def Main(): Unit = renderOnDomContentLoaded(
  dom.document.getElementById("app"),
  MainApp.appElement()
)