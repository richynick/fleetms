package com.richard.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/index2")
    public String widget(){
        return "index2";
    }
    @GetMapping("/hr")
    public String humanResource(){
        return "/hr/index";
    }
    @GetMapping("/fleet")
    public String fleet(){
        return "/fleet/index";
    }
    @GetMapping("/account")
    public String account(){
        return "/account/index";
    }
    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }
    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }
    @GetMapping("/parameter")
    public String parameter(){
        return "/parameter/index";
    }
}
