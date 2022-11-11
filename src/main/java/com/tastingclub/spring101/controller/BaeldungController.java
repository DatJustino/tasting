package com.tastingclub.spring101.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

public class BaeldungController {

  @RequestMapping(value = "/ex/foos", method = GET)
  @ResponseBody
  public String getFoosBySimplePath() {
    return "Get some Foos";
  }

  @RequestMapping(value = "/ex/foos", method = POST)
  @ResponseBody
  public String postFoos() {
    return "Post some Foos";
  }

  @RequestMapping(value = "/ex/foos",
      headers = "key=val", method = GET)
  @ResponseBody
  public String getFoosWithHeader() {
    return "Get some Foos with Header";
  }

  @RequestMapping(
      value = "/ex/foos",
      headers = { "key1=val1", "key2=val2" }, method = GET)
  @ResponseBody
  public String getFoosWithHeaders() {
    return "Get some Foos with Header";
  }

  @RequestMapping(
      value = "/ex/foos",
      method = GET,
      headers = "Accept=application/json")
  @ResponseBody
  public String getFoosAsJsonFromBrowser() {
    return "Get some Foos with Header Old";
  }

 @RequestMapping(
          value = "/ex/foos",
          method = GET,
          produces = { "application/json", "application/xml" })
  @ResponseBody
  public String getFoosAsJsonFromREST() {
    return "Get some Foos with Header New";
  }


}
