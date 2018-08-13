package com.java.augusto.business;

public class EmailNotificationHandler extends NotificationHandler{

	@Override
	public void receberNotificacao() {
		System.out.println("Notificando por Email.");
	}

	@Override
	public int getNotificacao() {
		return 1;
	}
	
}