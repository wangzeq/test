package com.hainiu;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04_xml {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        // 文档对象
        Document document = saxReader.read(new File("D:\\javaProjects\\hainiu49_javase\\day09-socket\\xml\\Students.xml"));

        // 解析文档 获取根标签
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        // 从根标签开始 一层层获取子标签即可
        List<Element> list = rootElement.elements();
        for (Element element : list) {
            List<Element> elements = element.elements();
            for (Element e : elements) {
                System.out.println(e.getName());
                String value = e.getText();
                System.out.println(value);
            }
        }
    }
}
