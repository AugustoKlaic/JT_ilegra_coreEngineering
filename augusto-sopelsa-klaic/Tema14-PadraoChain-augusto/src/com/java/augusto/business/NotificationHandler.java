package com.java.augusto.business;

public abstract class NotificationHandler {
	private NotificationHandler notification;

	public abstract void receberNotificacao();
	public abstract int getNotificacao();
	
	public void setProximoRequest(NotificationHandler notification) {
		this.notification = notification;
	}
	
	public void processaRequest(Request request) {
		if (request.getRequest() >= this.getNotificacao()) {
			this.receberNotificacao();
		}
		if(notification != null) {
			notification.processaRequest(request);
			}
	}
}
