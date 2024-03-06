package com.danielnamur.springboot.error.springbooterror.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.danielnamur.springboot.error.springbooterror.models.Error;

@RestControllerAdvice
public class HandlerExceptionController {

    /*
     * Alternativa
     *  @ExceptionHandler(ArithmeticException.class)
     *  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
     *  public Map<String, Object> divisionByZero(Exception exception) {
     *      Map<String, Object> error = new HashMap<>();
     *      error.put("date", new Date());
     *      error.put("error", "Error division por cero");
     *      error.put("message", exception.getMessage());
     *      error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
     * 
     *      return error;    
     *  }
     */

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionByZero(Exception exception) {
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error division por cero");
        error.setMessage(exception.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        
        //return ResponseEntity.internalServerError().body(error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFound(Exception exception) {
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Api no encontrada");
        error.setMessage(exception.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Error> numberFormat(Exception exception) {
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Numero invalido o incorrecto, no tiene formato de digito");
        error.setMessage(exception.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }
}
