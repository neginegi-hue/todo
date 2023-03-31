package com.example.todo.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todo.domains.Todo;
import com.example.todo.mappers.TodoMapper;

@Controller
public class TodoController {
    private final TodoMapper todoMapper;

    @Autowired
    public TodoController(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Todo> todos = todoMapper.all();
        model.addAttribute("todos", todos);
        return "index";
    }

    @PostMapping("/done")
    public String done(@RequestParam("id") int id) {
        todoMapper.done(id);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String showAddTodo() {
        return "add";
    }

    @PostMapping("/add")
    public String add(@RequestParam(name = "title") String title, @RequestParam(name = "limit") Date limit) {
        Todo todo = new Todo(false, title, limit);
        todoMapper.add(todo);
        return "redirect:/";
    }
}
