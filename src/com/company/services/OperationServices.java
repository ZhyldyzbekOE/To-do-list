package com.company.services;

import com.company.models.Operation;
import com.company.services.impl.OperationServicesImpl;

import java.util.List;

public interface OperationServices {

    OperationServices INSTANCE = new OperationServicesImpl();

    void createAffairOperation(String affairName, int day, String idCard, String comment);
    Operation closedAffairOperation(String idCard);
    void showList();

}
