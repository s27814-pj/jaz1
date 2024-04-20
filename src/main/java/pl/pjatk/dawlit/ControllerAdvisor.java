package pl.pjatk.dawlit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> doRuntimeException(RuntimeException ex){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("exception done" + ex.getLocalizedMessage());
    }

}
