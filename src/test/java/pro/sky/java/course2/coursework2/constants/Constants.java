package pro.sky.java.course2.coursework2.constants;

import pro.sky.java.course2.coursework2.domain.Question;

import java.util.Set;

public class Constants {
    public static final String QUESTION1 = "QUESTION1";
    public static final String QUESTION2 = "QUESTION2";
    public static final String QUESTION3 = "QUESTION3";
    public static final String QUESTION4 = "QUESTION4";
    public static final String QUESTION5 = "QUESTION5";
    public static final String ANSWER1 = "ANSWER1";
    public static final String ANSWER2 = "ANSWER2";
    public static final String ANSWER3 = "ANSWER3";
    public static final String ANSWER4 = "ANSWER4";
    public static final String ANSWER5 = "ANSWER5";
    public static final Question getQUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question getQUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question getQUESTION3 = new Question(QUESTION3, ANSWER3);
    public static final Question getQUESTION4 = new Question(QUESTION4, ANSWER4);
    public static final Question getQUESTION5 = new Question(QUESTION5, ANSWER5);
    public static final Set<Question> QUESTION_SET = Set.of(
            getQUESTION1, getQUESTION2, getQUESTION3, getQUESTION4, getQUESTION5);
}
