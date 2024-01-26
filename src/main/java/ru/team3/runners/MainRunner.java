package ru.team3.runners;

import com.opencsv.ICSVWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.team3.components.converters.CsvConverter;
import ru.team3.dto.xml.ExamlpleXmlWrapperDto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class MainRunner implements CommandLineRunner {

    @Autowired
    private CsvConverter csvConverter;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Run application....");
        csvConverter.read();
        csvConverter.write();
        System.out.println("Finish application....");

    }
}
