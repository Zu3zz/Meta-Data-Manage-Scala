package com.zth.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
 * Author: 3zZ.
 * Date: 2020/1/11 3:10 上午
 */
@RestController
class ScalaHello {
  @RequestMapping(value = Array("/scalaHello"),method = Array(RequestMethod.GET))
  def sayScalaHello(): String ={
    "hello from scala"
  }
}
