package com.Spring.crud.error;

import com.Spring.crud.entity.Success;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
@ResponseBody
public class RestResponseEntitySuccessHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SuccessHandler.class)
    public ResponseEntity<Success> departmentSuccess(SuccessHandler success, WebRequest request)
    {
        Success message= new Success(HttpStatus.ACCEPTED,success.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(message);
    }

}
