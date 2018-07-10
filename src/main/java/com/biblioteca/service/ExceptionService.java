package com.biblioteca.service;

public class ExceptionService extends RuntimeException {
    public ExceptionService(String msj){
        super(msj);
    }
}
