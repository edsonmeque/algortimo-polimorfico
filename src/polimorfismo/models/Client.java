package polimorfismo.models;

public class Client {
private String name;
private String email;
private String tel;
private boolean actve= false;

public Client( String name, String email, String tel) {
	super();

	this.name = name;
	this.email = email;
	this.tel = tel;
}
public boolean isActve() {
	return actve= true;
}
public void setActve(boolean actve) {
	this.actve = actve;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
}
