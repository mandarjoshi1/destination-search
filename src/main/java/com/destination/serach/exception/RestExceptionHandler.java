package com.destination.serach.exception;

import com.destination.serach.exception.model.QueryNotFoundException;
import com.destination.serach.model.SearchResponse;
import com.destination.serach.model.Status;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value
            = { QueryNotFoundException.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        return buildResponseEntity(new SearchResponse(Status.ERROR,ex.getMessage()));
    }

    private ResponseEntity<Object> buildResponseEntity(SearchResponse searchResponse) {
        return new ResponseEntity<>(searchResponse, HttpStatus.BAD_REQUEST);
    }
}
