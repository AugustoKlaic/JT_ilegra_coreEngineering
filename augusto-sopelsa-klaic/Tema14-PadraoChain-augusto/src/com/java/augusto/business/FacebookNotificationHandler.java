package com.java.augusto.business;

public class FacebookNotificationHandler extends NotificationHandler{

	@Override
	public void receberNotificacao() {
		System.out.println("Notificando por Facebook.");
	}

	@Override
	public int getNotificacao() {
		return 2;
	}
	
}