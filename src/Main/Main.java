package Main;

import Services.ActiveClientService;
import polimorfismo.models.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Client edson =new Client( "edson", "edson@gmail.com", "123456654");
		Client fernanda = new Client( "fernanda", "fernanda@gmail.com", "56543436556");
		ActiveClientService active =new ActiveClientService();
		active.activeClient(edson);
		active.activeClient(fernanda);

		fernanda.isActve();
	}

}
