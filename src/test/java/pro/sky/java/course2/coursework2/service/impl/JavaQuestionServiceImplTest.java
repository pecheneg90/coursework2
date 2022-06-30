package pro.sky.java.course2.coursework2.service.impl;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.coursework2.domain.Question;
import pro.sky.java.course2.coursework2.exceptions.DuplicateException;
import pro.sky.java.course2.coursework2.exceptions.NotFoundException;
import pro.sky.java.course2.coursework2.service.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.coursework2.constants.Constants.*;

class JavaQuestionServiceImplTest {
    public JavaQuestionServiceImplTest() {
        this.out = new JavaQuestionServiceImpl();
    }

    private final JavaQuestionService out;


    @Test
    void add() {
        int size;
        size = out.getAll().size();
        assertEquals(getQUESTION1, out.add(getQUESTION1));
        assertEquals(size + 1, out.getAll().size());
    }
    @Test
    void throwExceptionDuplicate() {
        out.add(getQUESTION1);
        assertThrows(DuplicateException.class, () -> out.add(getQUESTION1));
    }

    @Test
    void remove() {
        int size = out.getAll().size();
        out.add(getQUESTION2);
        assertEquals(getQUESTION2, out.remove(getQUESTION2));
        assertEquals(size, out.getAll().size());
    }

    @Test
    void throwExceptionNotFound() {
        out.add(getQUESTION1);
        Question notFoundQuestion = new Question(QUESTION1, ANSWER2);
        assertThrows(NotFoundException.class, () -> out.remove(notFoundQuestion));
    }

    @Test
    void getAll() {
        out.add(getQUESTION1);
        out.add(getQUESTION2);
        out.add(getQUESTION3);
        out.add(getQUESTION4);
        out.add(getQUESTION5);
        assertEquals(QUESTION_SET, out.getAll());
    }
}