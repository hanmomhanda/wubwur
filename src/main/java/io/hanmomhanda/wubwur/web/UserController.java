package io.hanmomhanda.wubwur.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/signUp")
    public ModelAndView signUp(ModelAndView mv) {
        mv.setViewName("welcome");
//        mv.setViewName("/user/signUp");
        mv.addObject("id", "hanmomhanda");
        mv.addObject("firstName", "Myung Woon");
        mv.addObject("lastName", "Oh");
        return mv;
    }
}
