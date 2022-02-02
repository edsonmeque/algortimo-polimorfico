package Services;

import Notification.NotificationEmail;
import polimorfismo.models.Client;

public class ActiveClientService {

	
	public void activeClient(Client client) {
		
		client.isActve();
		
		NotificationEmail noticarEmail = new NotificationEmail();
		noticarEmail.notificar(client, "o Seu cadastro no sistema esta ativo!");
	}
}
