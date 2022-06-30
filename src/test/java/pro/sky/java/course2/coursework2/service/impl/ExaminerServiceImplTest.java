package pro.sky.java.course2.coursework2.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import pro.sky.java.course2.coursework2.exceptions.BadRequestException;
import pro.sky.java.course2.coursework2.service.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static pro.sky.java.course2.coursework2.constants.Constants.*;

class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void ThrowExceptionBadRequest() {
        assertThrows(BadRequestException.class,
                () -> examinerService.getQuestions(10));
    }

    @Test
    void ReturnQuestionsFromTestingSet() {
        when(javaQuestionService.getAll()).thenReturn(QUESTION_SET);
        when(javaQuestionService.getRandomQuestions()).
                thenReturn(getQUESTION1).thenReturn(getQUESTION2).thenReturn(getQUESTION3).thenReturn(getQUESTION4);
        assertTrue(QUESTION_SET.containsAll(examinerService.getQuestions(4)));
    }

    @Test
    void getQuestion() {
        when(javaQuestionService.getAll()).thenReturn(QUESTION_SET);
        when(javaQuestionService.getRandomQuestions()).
                thenReturn(getQUESTION1).thenReturn(getQUESTION2).thenReturn(getQUESTION3).thenReturn(getQUESTION4);
        assertEquals(3, examinerService.getQuestions(3).size());
    }
}