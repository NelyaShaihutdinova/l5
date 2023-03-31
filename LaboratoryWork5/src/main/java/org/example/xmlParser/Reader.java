package org.example.xmlParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.entities.HumanBeing;
//import org.example.entities.HumanBeings;

import java.io.*;
import java.util.Arrays;
import java.util.List;

//@JacksonXmlElementWrapper
public class Reader {
    private File file;
    public Reader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public List<HumanBeing> getPersons() {
        return Arrays.asList(parsingPersonsFromXml(readFileToString(file)));
    }

    private String readFileToString(File file) {
        byte[] data;
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            data = inputStream.readAllBytes();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "";
        }
        return new String(data);
    }

//    private HumanBeings parsingPersonsFromXml(String data) {
//        XmlMapper xmlmapper = new XmlMapper();
//        try {
//            HumanBeings humanBeings = xmlmapper.readValue(data, HumanBeings.class);
//            return humanBeings;
//        } catch (JsonProcessingException e) {
//            System.out.println(e.getMessage());
//            return new HumanBeings();
//        }
//    }
private HumanBeing[] parsingPersonsFromXml(String data) {
        XmlMapper xmlmapper = new XmlMapper();
        try {
            HumanBeing[] humanBeing = xmlmapper.readValue(data, HumanBeing[].class);
            return humanBeing;
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            return new HumanBeing[0];
        }
    }
}