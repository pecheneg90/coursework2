package pro.sky.java.course2.coursework2.domain;

import java.util.Objects;

public class Question {
    String question;
    String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Data{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question data = (Question) o;
        return question.equals(data.question) && answer.equals(data.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}