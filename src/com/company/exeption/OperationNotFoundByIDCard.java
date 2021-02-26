package com.company.exeption;

public class OperationNotFoundByIDCard extends RuntimeException{

    public OperationNotFoundByIDCard(String message) {
        super(message);
    }
}
