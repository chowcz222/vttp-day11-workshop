package day11.workshop.day11workshop.controller;

import java.util.Date;
import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class Imagecontroller {
    
    @GetMapping()
    public String getImage(Model model) {
        // File image = new File("bob.jpg");
        String image = "bob.jpg";
        String word = "Picture of the Day";
        model.addAttribute("imagesrc", image);
        model.addAttribute("line", word);
        return "index";
    }

    
}
