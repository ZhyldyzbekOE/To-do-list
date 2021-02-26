package com.company;
import java.util.*;
import com.company.models.Affairs;
import com.company.models.Operation;
import com.company.services.OperationServices;

public class Main {

    public static void main(String[] args) {

        OperationServices operationServices = OperationServices.INSTANCE;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Select an action: ");
            System.out.println("1. Add to-do\n2. Close to-do\n3. View to-do list\n4. Exit");
            System.out.print("Your choose: ");
            int choose = scan.nextInt();
            System.out.println("\n");

            if(choose == 1){

                System.out.print("Enter affair name: ");
                scan.nextLine();
                String affairName = scan.nextLine();
                System.out.print("Days: ");
                int day = scan.nextInt();
                System.out.print("Enter idCard: ");
                scan.nextLine();
                String idCard = scan.nextLine();
                System.out.println("Add a comment: ");
                String comment = scan.nextLine();
                System.out.println("To-do added! ");
                operationServices.createAffairOperation(affairName, day, idCard, comment);
                System.out.println("\n");

            }else if(choose == 2){

                System.out.print("Enter idCard for close: ");
                scan.nextLine();
                String idCardClose = scan.nextLine();
                System.out.println("To-do closed!");
                operationServices.closedAffairOperation(idCardClose); // Метод для закрытия операции
                System.out.println("\n");

            }else if(choose == 3){

                operationServices.showList(); // вывод операций
                System.out.println("\n");

            }else if(choose == 4){

                System.out.println("Good buy!");

                break;
            }else {

                System.out.println("Invalid command");
            }
        }
    }
}
