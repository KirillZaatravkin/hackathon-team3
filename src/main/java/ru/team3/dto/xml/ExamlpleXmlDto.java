package ru.team3.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@JacksonXmlRootElement(localName = "fruit")
@Data
public class ExamlpleXmlDto implements Serializable {

    @JacksonXmlProperty(isAttribute = true, localName = "id")
    private int id;

    @JacksonXmlProperty(localName = "name")
    private String name;

}
