package ru.team3.components.converters;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import ru.team3.dto.json.ExampleJsonDto;

import java.io.File;

@Service
@RequiredArgsConstructor
public class JsonConverter {

    private final ObjectMapper objectMapper;

    private static final String path = "expl.xml";

    @SneakyThrows
    public ExampleJsonDto readJson(String path1) {
        File file = new File(path1);
        return objectMapper.readValue(file, ExampleJsonDto.class);
    }

    @SneakyThrows
    public void writeJson(ExampleJsonDto dto) {
        objectMapper.writeValue(new File(path), dto);
    }
}
