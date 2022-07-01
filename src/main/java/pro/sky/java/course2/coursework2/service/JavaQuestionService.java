package pro.sky.java.course2.coursework2.service;

import pro.sky.java.course2.coursework2.domain.Question;

import java.util.Collection;

public interface JavaQuestionService {

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestions();
}