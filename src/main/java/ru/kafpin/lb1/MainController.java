package ru.kafpin.lb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/form")
    public String mainForm(Model model) {
        model.addAttribute("student", new Student());
        return "main-form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("student") Student student, Model model) {
        student.generateGroupAndLogin();
        model.addAttribute("student", student);
        return "result";
    }
}