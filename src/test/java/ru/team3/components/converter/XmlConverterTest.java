package ru.team3.components.converter;

import org.junit.jupiter.api.Test;
import ru.team3.components.converters.XmlConverter;
import ru.team3.config.XmlConfiguration;
import ru.team3.dto.xml.ExamlpleXmlDto;
import ru.team3.dto.xml.ExamlpleXmlWrapperDto;

import java.io.IOException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class XmlConverterTest {
    XmlConfiguration xmlConfiguration = new XmlConfiguration();
    XmlConverter xmlConverter = new XmlConverter(xmlConfiguration.xmlMapper());

    @Test
    public void test() throws IOException {
        ExamlpleXmlWrapperDto valuesBefore = generateValues();
        xmlConverter.writeFruits(valuesBefore);
        ExamlpleXmlWrapperDto valuesAfter = xmlConverter.readFruits();

        assertThat(valuesAfter.getFruit()).isEqualTo(valuesBefore.getFruit());
    }

    private ExamlpleXmlWrapperDto generateValues(){
        ExamlpleXmlDto value = new ExamlpleXmlDto();
        value.setName("apple");
        value.setId(10);

        ExamlpleXmlDto value2 = new ExamlpleXmlDto();
        value2.setName("orange");
        value2.setId(10);

        ExamlpleXmlWrapperDto values = new ExamlpleXmlWrapperDto();
        values.setFruit(new ArrayList<>());
        values.getFruit().add(value);
        values.getFruit().add(value2);
        return values;
    }

}
