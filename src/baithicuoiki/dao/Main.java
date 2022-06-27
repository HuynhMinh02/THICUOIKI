package baithicuoiki.dao;

import java.util.Scanner;

import baithicuoiki.controller.NewReadersControl;
import baithicuoiki.entity.Readers;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Readers reader = new Readers();
        NewReadersControl newReadersControl = new NewReadersControl(reader);

        int key;
        do {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("| 1>> Check information readers and borrowed books!                               |");
            System.out.println("| 2>> Add information about readers coming to borrow books!                       |");
            System.out.println("| 3>>Check information about books borrowed from readers who come to return books!|");
            System.out.println("| 4>> Quit!!! Thank you!                                                          |");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    System.out.println("Check information readers and borrowed books!");
                    newReadersControl.ReadersBorrowed();
                    break;
                case 2:
                    System.out.println("Add information about readers coming to borrow books!");
                    System.out.println("[ADD]:Enter ADD ");
                    newReadersControl.AddReaders();
                    
                    break;
                case 3:
                    System.out.println("Check information about books borrowed from readers who come to return books!");

                    break;
                case 4:
                    System.out.println("Exit!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Syntax error!!");
                    break;
            }
        } while (key != 0);

    }

}
