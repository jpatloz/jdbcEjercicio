package jdbc.dao;

public class alumno {
	private int id_alumno;
	private String nombre;
	private String apellidos;
	private String email;
	
	
	
	public alumno(int id_alumno, String nombre, String apellidos, String email) {
		
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}