package com.galaxy.codegenerator.exception;

/**
 * CheckedException
 *
 * @author yanghaolei
 * @date 9/14/21 2:36 PM
 */

public class CheckedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CheckedException(String message){
        super(message);
    }

    public CheckedException(String message,Throwable cause){
        super(message,cause);
    }

    public CheckedException(){

    };
}

