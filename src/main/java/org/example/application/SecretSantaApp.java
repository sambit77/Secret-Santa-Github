package org.example.application;

import org.example.Exception.UserListEmptyException;
import org.example.model.User;
import org.example.model.UserOutput;
import org.example.service.CsvProcessorService;
import org.example.service.ICsvProcessorService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretSantaApp {
    static ICsvProcessorService csvProcessorService = new CsvProcessorService();
    public List<UserOutput> startProcessing(String inputFileName) throws UserListEmptyException {
        //Read list of users from csv to java pojo
        List<User> users = csvProcessorService.readCSV(inputFileName);

        if (users == null) {
            throw new UserListEmptyException("Invalid Entry/File does not contain any users");
        }

        //Shuffle the list of users
        Collections.shuffle(users);
        //map users and store mappings in UserOutput
        List<UserOutput> assignmentMappings = mapUsers(users);

        //Output file path
        String outputFileName = "src/main/resources/assignments.csv";
        csvProcessorService.writeCSV(outputFileName,assignmentMappings);

        return assignmentMappings;
    }
    public  List<UserOutput> mapUsers(List<User> users)
    {
        List<UserOutput> assignmentMappings = new ArrayList<>();
        for(int i = 0 ; i < users.size()-1 ; i++)
        {
            User giver = users.get(i);
            User receiver = users.get(i+1);
            UserOutput assignmentMapping = new UserOutput(giver.getId(),giver.getName(),giver.getEmail(),
                    receiver.getId(),receiver.getName(),receiver.getEmail());
            assignmentMappings.add(assignmentMapping);

        }
        User giver = users.get(users.size()-1);
        User receiver = users.get(0);
        UserOutput assignmentMapping = new UserOutput(giver.getId(),giver.getName(),giver.getEmail(),
                receiver.getId(),receiver.getName(),receiver.getEmail());
        assignmentMappings.add(assignmentMapping);

        return assignmentMappings;
    }


}
