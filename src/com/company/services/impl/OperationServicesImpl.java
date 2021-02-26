package com.company.services.impl;

import com.company.enums.AffairStatus;
import com.company.exeption.OperationNotFoundByIDCard;
import com.company.models.Affairs;
import com.company.models.Operation;
import com.company.services.OperationServices;

import java.util.ArrayList;


public class OperationServicesImpl implements OperationServices {

    ArrayList<Operation> operations = new ArrayList<>();


    private Operation findOpenOperations(int day, String idCard){

        for (Operation item : operations) {
            if (item.getIdCard().equals(idCard)){
                return item;
            }
        }

        Operation operation = new Operation(day, idCard);
        operations.add(operation);
        return operation;
    }

    @Override
    public void createAffairOperation(String affairName, int day, String idCard, String comment) {

        Operation operation = findOpenOperations(day, idCard);
        Affairs affair = new Affairs(affairName, comment);
        operation.addAffairs(affair);
    }

    private Operation findOperationByIdCard(String idCard){
        for (Operation item:operations) {
            if (item.getIdCard().equals(idCard)){
                return item;
            }
        }
        throw new OperationNotFoundByIDCard("Operation not found by id Card: " + idCard);
    }

    @Override
    public Operation closedAffairOperation(String idCard) {
        Operation operation = findOperationByIdCard(idCard);
        operation.setStatus(AffairStatus.CLOSED);
        return operation;
    }

    @Override
    public void showList(){
        int i = 0;
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("List affairs: ");
        for (Operation item: operations) {

            for (Affairs aff: item.getAffairs()) {
                i++;
                System.out.println(i+") "+"Name affair: "+aff.getName() +"\n"+"Start date: "+item.getStartDate()+" \n"+ "End date: "+item.getEndDate() + " \n"+"Operation status: "+item.getStatus()+" \n"+"Id-Card: " + item.getIdCard()+" \n"+"Comment: " +aff.getComment());
                System.out.print("\n");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

}
