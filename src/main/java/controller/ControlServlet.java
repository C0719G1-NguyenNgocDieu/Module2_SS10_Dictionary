package controller;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ControlServlet {
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model){
        Dictionary dictionary =new Dictionary();
        model.addAttribute("search",search);
        model.addAttribute("result",dictionary.getVietnamese(search));
        if(dictionary.getVietnamese(search)==null){
            return "found";
        }
            return "search";
    }
}
