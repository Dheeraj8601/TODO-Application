package com.dheeraj.TODOapplication.controllers;
import org.springframework.stereotype.Controller;
import com.dheeraj.TODOapplication.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", todoItemService.getAll());
        return modelAndView;
    }
}
