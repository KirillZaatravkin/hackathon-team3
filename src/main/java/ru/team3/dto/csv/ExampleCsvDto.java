package ru.team3.dto.csv;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleCsvDto {
    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName(column = "age")
    private int age;


    @Override
    public String toString() {
        return "DTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
