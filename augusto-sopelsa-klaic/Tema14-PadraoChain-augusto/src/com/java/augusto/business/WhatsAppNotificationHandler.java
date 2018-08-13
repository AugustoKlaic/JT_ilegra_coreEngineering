package com.java.augusto.business;

public class WhatsAppNotificationHandler extends NotificationHandler{

	@Override
	public void receberNotificacao() {
		System.out.println("Notificando por WhatsApp.");
	}

	@Override
	public int getNotificacao() {
		return 3;
	}
	
}