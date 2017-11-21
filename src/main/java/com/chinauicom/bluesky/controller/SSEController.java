package com.chinauicom.bluesky.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * 服务端服务推 (server send event) - 示例
 *
 * @author zhouwb15
 */
@Controller
public class SSEController {

    @RequestMapping(value="/push",produces = "text/event-stream")
    @ResponseBody
    public String push(){
        Random r = new Random();
        try{

            Thread.sleep(5000);
        }catch (Exception e){

        }

        int num = r.nextInt();
        return "Data: " + num;
    }
}
