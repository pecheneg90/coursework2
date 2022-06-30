package pro.sky.java.course2.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.coursework2.domain.Question;
import pro.sky.java.course2.coursework2.service.JavaQuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaController {
    private final JavaQuestionService javaQuestionService;

    public JavaController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/add") //“/exam/java/add?question=QuestionText&answer=QuestionAnswer - добавить”
    public Question add(@RequestParam String question, @RequestParam String answer) {
        return javaQuestionService.add(new Question(question, answer));
    }

    @GetMapping("/remove") //“/exam/java/remove?question=QuestionText&answer=QuestionAnswer - удалить”
    public Question removeQuestion(@RequestParam String question, String answer) {
        return javaQuestionService.remove(new Question(question, answer));
    }

    @GetMapping//“/exam/java/ - все вопросы и ответы”
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }
}