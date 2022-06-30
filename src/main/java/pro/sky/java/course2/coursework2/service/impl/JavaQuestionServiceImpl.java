package pro.sky.java.course2.coursework2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.coursework2.domain.Question;
import pro.sky.java.course2.coursework2.exceptions.DuplicateException;
import pro.sky.java.course2.coursework2.exceptions.NotFoundException;
import pro.sky.java.course2.coursework2.service.JavaQuestionService;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class JavaQuestionServiceImpl implements JavaQuestionService {
    private final Set<Question> questions = new HashSet<>();
    private final Random random = new Random();

    @Override
    public Question add(Question question) {
        if (questions.add(question)) {
            return question;
        }
        throw new DuplicateException("такой вопрос есть");
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new NotFoundException("не найден вопрос, для удаления");
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestions() {
        List<Question> questionList = new ArrayList<>(getAll());
        return questionList.get(random.nextInt(questions.size()));
    }

    @PostConstruct
    private void initQuestions() {
        for (int i = 0; i < 6; i++) {
            questions.add(new Question("question " + i, "answer" + i));
        }
    }
}