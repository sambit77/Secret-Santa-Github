package org.example.service;

import org.example.model.User;
import org.example.model.UserOutput;

import java.util.List;

public interface ICsvProcessorService {

    public void writeCSV(String fileName, List<UserOutput> userMappings);
    public List<User> readCSV(String fileName);
}
