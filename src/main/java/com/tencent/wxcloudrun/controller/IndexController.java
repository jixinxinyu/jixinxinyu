package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * index控制器
 */
@Controller

public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping
  public String index(@RequestParam String signature,@RequestParam String timestamp,@RequestParam String nonce,@RequestParam String echostr) {
    System.out.println("signature："+signature);
    System.out.println("timestamp："+timestamp);
    System.out.println("nonce："+nonce);
    System.out.println("echostr："+echostr);
    return "echostr";
  }

}
