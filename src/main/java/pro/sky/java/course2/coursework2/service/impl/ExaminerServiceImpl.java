package pro.sky.java.course2.coursework2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.coursework2.domain.Question;
import pro.sky.java.course2.coursework2.exceptions.BadRequestException;
import pro.sky.java.course2.coursework2.service.ExaminerService;
import pro.sky.java.course2.coursework2.service.JavaQuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > javaQuestionService.getAll().size()) {
            throw new BadRequestException("неверный запрос");
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(javaQuestionService.getRandomQuestions());
        }
        return questions;
    }
}