package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    public List<Card> xmlParser(){
        List<Card> cards = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            try {
                Document doc = builder.parse("src/main/data/Cards.xml");
                doc.getDocumentElement().normalize();
                Element root = doc.getDocumentElement();
                NodeList allCards = root.getChildNodes();
                List<Integer> constarray = new ArrayList<>();
                for (int i = 0; i < allCards.getLength() ; i++) {
                    Node cardnode = allCards.item(i);
                    if (cardnode.getNodeType() == cardnode.ELEMENT_NODE){
                        NodeList parameters = cardnode.getChildNodes();
                        Element nElement = (Element) parameters;
                        NodeList nL = nElement.getElementsByTagName("*");
                        String name = nL.item(0).getTextContent();
                        int price = Integer.valueOf(nL.item(1).getTextContent());
                        int speed = Integer.valueOf(nL.item(2).getTextContent());
                        int carry = Integer.valueOf(nL.item(3).getTextContent());
                        int distance = Integer.valueOf(nL.item(4).getTextContent());
                        Card card = new Card(name, price, speed, carry, distance);
                        cards.add(card);
                    }
                }

            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return cards;

    }

    
}
