package com.example;
 
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
 
@XmlRootElement(name = "NameType", namespace = "http://www.example.com/v2")
public class XmlNamespaceFp {
 
    public void test() {
        QName q = new QName("http://www.w3.org/2001/XMLSchema", "string");
        System.out.println(q);
    }
}
