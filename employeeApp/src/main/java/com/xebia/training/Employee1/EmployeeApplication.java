package com.xebia.training.Employee1;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.xebia.training.Employee2.EmployeeData;

public class EmployeeApplication {
	public static void main(String args[]) throws ParseException,
			NumberFormatException, IOException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException {

		EmployeeData employee = new EmployeeData();
		employee.setValues();
		

		
	}

}
