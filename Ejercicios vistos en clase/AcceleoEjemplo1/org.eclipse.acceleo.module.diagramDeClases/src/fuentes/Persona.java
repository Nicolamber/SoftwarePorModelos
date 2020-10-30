package fuentes;

public class Persona{

	private String nombrePersona;
	private int edadPersona;
	private String profesionPersona;
 

	public Persona() {}

	public Persona(String nombrePersona
	,int edadPersona
	,String profesionPersona
	){
		this.nombrePersona= nombrePersona;
		this.edadPersona= edadPersona;
		this.profesionPersona= profesionPersona;
}

	public String getNombrePersona(){
		return nombrePersona;
	}
	public int getEdadPersona(){
		return edadPersona;
	}
	public String getProfesionPersona(){
		return profesionPersona;
	}

	public void setNombrePersona(String nombrePersona){
		this.nombrePersona= nombrePersona;
	}
	public void setEdadPersona(int edadPersona){
		this.edadPersona= edadPersona;
	}
	public void setProfesionPersona(String profesionPersona){
		this.profesionPersona= profesionPersona;
	}

	private void caminar(){
};
	private int correr(){
			return 0;
};
	private boolean cantar(){
			return true;
};

}
