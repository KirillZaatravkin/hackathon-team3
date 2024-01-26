package ru.team3.components.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import ru.team3.components.converters.JsonConverter;
import ru.team3.dto.json.ExampleJsonDto;
import ru.team3.dto.xml.ExamlpleXmlWrapperDto;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonConverterTest {
    JsonConverter jsonConverter = new JsonConverter(new ObjectMapper());

    @Test
    void test(){
        ExampleJsonDto dto = new ExampleJsonDto(1,"test");
        ExampleJsonDto expected = jsonConverter.readJson("src/test/resources/testJson");
        assertThat(dto).isEqualTo(expected);
    }
}
