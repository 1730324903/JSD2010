package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 使用DOM解析XML
 */
public class ParseXmlDemo {
    public static void main(String[] args) {
        /*
        使用DOM4J解析XML的大致步骤
        1:创建SAXReader
        2:使用SAXReader读取xml文档并生成Document对象
          该对象中包含了解析xml文档后生成的整棵树
        3:通过Document获取跟元素
        4:从跟元素开始按照xml文档的结构逐级获取子元素已达到遍历xml文档数据的目的
         */
        try {
            //1
            SAXReader reader = new SAXReader();
            //2
            Document doc = reader.read("./emplist.xml");
            /*
            3
            Document提供获取跟元素的方法:
            Element getRootElement()

            Element的每一个实例用于表示XML文档中的一个元素(一对标签)，通过它可以获取
            到其表示的这个标签的一切信息，常见的方法有:
            String getName() 获取标签名
            String getText() 获取标签中间的文本(开始与结束标签之间的文本信息)
            Element elements(String name) 获取指定名字的子标签
            List element() 当前标签下获取所有子标签
            List element(String name) 获取当前标签下所有指定的同名子标签
             */
            Element root = doc.getRootElement();
            String name = root.getName();
            System.out.println(name);
            //获取根标签<list>下所有<emp>子标签
            List<Element> list = root.elements("emp");
            System.out.println(list.size());
            //遍历集合获取元素
            for(Element empEle : list){
                //获取姓名
                Element nameEle = empEle.element("name");
                String ename = nameEle.getText();
                //System.out.println(ename);
                //获取年龄
                Element ageEle = empEle.element("age");
                int eage = Integer.parseInt(ageEle.getText());
                //int eage = Integer.parseInt(empEle.elementText("age"));
                //System.out.println(eage);
                //获取性别
                String gender = empEle.elementText("gender");
                //与上面的方法是等效的
                //String gender = empEle.element("gender").getText();
                //System.out.println(gender);
                //获取工资
                int salary = Integer.parseInt(empEle.elementText("salary"));
                //System.out.println(salary);

                //Attribute attr = empEle.attribute("id");
                //int id = Integer.parseInt(attr.getValue());
                //int id = Integer.parseInt(empEle.attribute("id").getValue());
                int id = Integer.parseInt(empEle.attributeValue("id"));
                System.out.println(id+","+ename+","+eage+","+gender+","+salary);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
