package com.qa

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

// File Edited by ....

class MainServlet extends ScalatraServlet with ScalateSupport {
  before() {
    contentType = "text/html"
  }

  get("/") {
    layoutTemplate("/WEB-INF/templates/views/index.ssp")
  }

  get("/dinosaur") {
    layoutTemplate("/WEB-INF/templates/views/dinosaur.ssp")
  }
}
