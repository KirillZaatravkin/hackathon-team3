package ru.team3.components.converters;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.team3.dto.xml.ExamlpleXmlWrapperDto;

import java.io.File;
import java.io.IOException;


@Service
@RequiredArgsConstructor
public class XmlConverter {

    private final XmlMapper xmlMapper;

    private final static String path = "fruits.xml";


    public void writeFruits(ExamlpleXmlWrapperDto values) throws IOException {
        xmlMapper.writeValue(new File(path), values);
    }

    public ExamlpleXmlWrapperDto readFruits() throws IOException {
        return xmlMapper.readValue(new File(path), ExamlpleXmlWrapperDto.class);
    }

}
