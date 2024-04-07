package com.springworks.springworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    @GetMapping("/grades")
    public String getGrades(Model model) {
        //Grade grade = new Grade("John", "Math", "100");

        model.addAttribute("grade1", new Grade("John", "Math", "100"));
        model.addAttribute("grade2", new Grade("Marry", "Physics", "90"));
        model.addAttribute("grade3", new Grade("Harry", "Chemistry", "80"));

        return "grades";
    }
}
