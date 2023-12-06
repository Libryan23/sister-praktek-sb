/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libryan.latihan1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Modern 14
 */
@Controller
public class GreetingController {
    @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name",
                required=false, defaultValue = "World") String name, Model model) {
            model.addAttribute("name", name);
            return "greeting";
        }
    
}
