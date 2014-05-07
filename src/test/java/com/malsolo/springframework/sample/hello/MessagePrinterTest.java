package com.malsolo.springframework.sample.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class MessagePrinterTest {
	
	@Autowired
	MessagePrinter printer;
	
	@Test
	public void testMarkerMethod() {
	}
	
	@Test
	public void testPrintMessage() {
		printer.printMessage();
	}

}
