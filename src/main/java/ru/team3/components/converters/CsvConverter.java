package ru.team3.components.converters;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.stereotype.Service;
import ru.team3.dto.csv.ExampleCsvDto;
import ru.team3.dto.xml.ExamlpleXmlWrapperDto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvConverter {

    private String inputFileName = "file_csv.csv";
    private String outputFileName = "output.csv";
    private  boolean headerDrop = true;

    public void read()  throws IOException {
        try (FileReader reader = new FileReader(inputFileName)) {
            CsvToBean<ExampleCsvDto> csvToBean = new CsvToBeanBuilder<ExampleCsvDto>(reader)
                    .withType(ExampleCsvDto.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<ExampleCsvDto> dtos = csvToBean.parse();

            for (ExampleCsvDto dto : dtos) {
                System.out.println(dto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void write() throws IOException {
        List<ExampleCsvDto> dtos = new ArrayList<>();
        dtos.add(new ExampleCsvDto("Иванов", 25));
        dtos.add(new ExampleCsvDto("Петров", 30));

        try (FileWriter writer = new FileWriter(outputFileName)) {
            StatefulBeanToCsv<ExampleCsvDto> beanToCsv = new StatefulBeanToCsvBuilder<ExampleCsvDto>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();

            beanToCsv.write(dtos);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
