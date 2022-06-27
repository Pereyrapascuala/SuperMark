package models;

public class Usuarios {
	//atributos
	private String email;
	private Clientes idCliente;
	private String clave;
	private String tipoUsuario;
	//constructores
	public Usuarios(String email, Clientes idCliente, String clave, String tipoUsuario) {
		super();
		this.email = email;
		this.idCliente = idCliente;
		this.clave = clave;
		this.tipoUsuario = tipoUsuario;
	}
	public Usuarios() {
		super();
	}
	//setters and getters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Clientes getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Clientes idCliente) {
		this.idCliente = idCliente;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	//metodos
	@Override
	public String toString() {
		return "Usuarios [email=" + email + ", idCliente=" + idCliente + ", clave=" + clave + ", tipoUsuario="
				+ tipoUsuario + "]";
	}
	
	
	

}
