package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Calc;
@Controller
public class CalcController {
    @GetMapping(value = "/calc")
    public String printWelcome(ModelMap model, @RequestParam(value = "a", required = false) int a
            , @RequestParam(value = "b", required = false) int b, @RequestParam(value = "action", required = false) String action) {

        model.addAttribute("result", Calc.getResult(a,b,action));
        return "calc";
    }
}
