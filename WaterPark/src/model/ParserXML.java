package model;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;


public class ParserXML {

	public static void Parse(String[] args) throws Exception{
		if(args.length < 2){
			//TODO throw exception - no input files.
		}
		String fileName = args[1];
		if(fileName==null){
			//TODO something
		}
		
	}
}
