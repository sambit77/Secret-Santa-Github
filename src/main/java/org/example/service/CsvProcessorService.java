package org.example.service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.example.model.User;
import org.example.model.UserOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CsvProcessorService implements ICsvProcessorService{
    @Override
    public void writeCSV(String fileName, List<UserOutput> userMappings) {
        try (FileWriter writer = new FileWriter(fileName)) {
            StatefulBeanToCsv<UserOutput> beanToCsv = new StatefulBeanToCsvBuilder<UserOutput>(writer).build();
            beanToCsv.write(userMappings);
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> readCSV(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
