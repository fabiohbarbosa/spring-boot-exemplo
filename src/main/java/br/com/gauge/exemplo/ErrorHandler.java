package br.com.gauge.exemplo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * App Handler Exception
 * Created by fabio on 08/09/15.
 */
@ControllerAdvice
public class ErrorHandler {
    /**
     * Handle exception in Service Layer
     * @param e Exception
     * @return Custom JSON Envelope Error
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorDTO> handle(Exception e) {
        final ErrorDTO errorDTO = new ErrorDTO(e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}