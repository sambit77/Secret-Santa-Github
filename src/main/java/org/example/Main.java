package org.example;

import org.example.Exception.UserListEmptyException;
import org.example.application.SecretSantaApp;
import org.example.model.UserOutput;

import java.util.List;


public class Main {

    static SecretSantaApp secretSantaAppInstance = new SecretSantaApp();
    public static void main(String[] args) throws UserListEmptyException {
        String fileName = "users";
        if(args.length == 0)
        {
            System.out.println("You have not entered the filename, using default FileName = Users");
        }
        else
        {
            fileName = args[0];
        }
        //Input file path
        String inputFileName = "src/main/resources/"+fileName+".csv";
        List<UserOutput> assignmentMappings = secretSantaAppInstance.startProcessing(inputFileName);
        printMappingsToConsole(assignmentMappings);
    }

    public  static void printMappingsToConsole(List<UserOutput> assignmentMappings)
    {
        System.out.println("giver_id,giver_name,giver_email,receiver_id,receiver_name,receiver_email");
        for(UserOutput output : assignmentMappings)
        {
            System.out.println(output.toString());
        }
    }


}