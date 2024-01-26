package ru.team3.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import ru.team3.dto.xml.ExamlpleXmlDto;

import java.io.Serializable;
import java.util.List;

@JacksonXmlRootElement(localName = "fruits")
@Data
public class ExamlpleXmlWrapperDto implements Serializable {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ExamlpleXmlDto> fruit;

}
