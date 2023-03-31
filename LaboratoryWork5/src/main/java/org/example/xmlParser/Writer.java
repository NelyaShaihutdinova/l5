package org.example.xmlParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.entities.HumanBeing;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//public class Writer {

//
//        public List<HumanBeing> getPersons() {
//            return Arrays.asList(writeFileToString(parsingPersonsToXml()));
//        }
//
//        private String writeFileToString(File file) {
//            byte[] data;
//            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
//                data = inputStream.readAllBytes();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//                return "";
//            }
//            return new String(data);
//        }
//
//        //    private HumanBeings parsingPersonsFromXml(String data) {
////        XmlMapper xmlmapper = new XmlMapper();
////        try {
////            HumanBeings humanBeings = xmlmapper.readValue(data, HumanBeings.class);
////            return humanBeings;
////        } catch (JsonProcessingException e) {
////            System.out.println(e.getMessage());
////            return new HumanBeings();
////        }
////    }
//        private HumanBeing[] parsingPersonsToXml(String data) {
//            XmlMapper xmlmapper = new XmlMapper();
//            try {
//                HumanBeing[] humanBeing = xmlmapper.readValue(data, HumanBeing[].class);
//                return humanBeing;
//            } catch (JsonProcessingException e) {
//                System.out.println(e.getMessage());
//                return new HumanBeing[0];
//            }
//        }
//    }
