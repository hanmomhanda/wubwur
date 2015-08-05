package io.hanmomhanda.wubwur.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(value="name", required=false, defaultValue="Thymeleaf") String name, ModelAndView mv) {
        mv.setViewName("greeting");
        mv.addObject("name", name);
        mv.addObject("hot", "Not Swapping!!");
        return mv;
    }
}
