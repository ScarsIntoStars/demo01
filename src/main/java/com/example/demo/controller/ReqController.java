package com.example.demo.controller;

import com.example.demo.dto.DemoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReqController {
    @GetMapping("req1")
    public String req1(@RequestParam("p1") String p1, @RequestParam("age") int age){
        System.out.println("p1 : " + p1 + " and " + "age : " + age);
        return "index";
    }

    @GetMapping("req2/{p3}")
    public String req2(@PathVariable("p3") String p3){
        System.out.println("p3 = " + p3);
        return "index";
    }

    @PostMapping("req3")
    public String req3(@RequestParam("name") String p1, @RequestParam("age") int age){
        System.out.println("p1 : " + p1 + " and " + " age : " + age);
        return "index";
    }

    @GetMapping("req4")
    public String req4(Model model) {
        model.addAttribute("p1", "안녕하세요");
        model.addAttribute("p2", "반갑습니다");
        model.addAttribute("a1", "주일에도 코딩공부를 합시다!");
        return "req4";
    }

    @GetMapping("req5")
    public String req5(Model model) {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setId(1);
        demoDTO.setName("babo");
        demoDTO.setAge(5);
        model.addAttribute("demo", demoDTO);
        return "req5";
    }
}
