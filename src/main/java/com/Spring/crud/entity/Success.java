package com.Spring.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Success {

    private HttpStatus status;
    private String message;
    private Object data;
}
