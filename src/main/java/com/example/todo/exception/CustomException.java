package com.example.todo.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomException extends RuntimeException{

    private String message;

    private HttpStatus status;


}
