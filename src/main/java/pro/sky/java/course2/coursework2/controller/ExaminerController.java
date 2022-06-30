package pro.sky.java.course2.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.coursework2.domain.Question;
import pro.sky.java.course2.coursework2.service.ExaminerService;

import java.util.Collection;

@RestController
public class ExaminerController {
    private final ExaminerService examinerService;

    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}") // ”/exam/get/5”
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}