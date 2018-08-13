package com.java.augusto.main;

import com.java.augusto.business.EmailNotificationHandler;
import com.java.augusto.business.FacebookNotificationHandler;
import com.java.augusto.business.Request;
import com.java.augusto.business.WhatsAppNotificationHandler;

public class Main {
	public static void main(String[] args) {
		EmailNotificationHandler email = new EmailNotificationHandler();
		FacebookNotificationHandler facebook = new FacebookNotificationHandler();
		WhatsAppNotificationHandler whatsapp = new WhatsAppNotificationHandler();
		
		
		email.setProximoRequest(facebook);
		facebook.setProximoRequest(whatsapp);
		
		email.processaRequest(new Request(3));
	}
}