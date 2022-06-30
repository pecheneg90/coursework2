package pro.sky.java.course2.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DuplicateException extends RuntimeException {

    public DuplicateException(String message) {
        super(message);
    }
}
