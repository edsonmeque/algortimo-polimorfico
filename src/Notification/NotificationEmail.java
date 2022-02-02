package Notification;

import polimorfismo.models.Client;

public class NotificationEmail {

	public void notificar(Client client, String message) {
		
		System.out.printf("Nome client:s% atravez de e-mail:s% s%",
				client.getName(),client.getEmail(),message);
	}
}
