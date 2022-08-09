public class Persona {

    private String nombre;
    private int edad;
    private String teléfono;

  public void setNombre(String nombre){
      this.nombre = nombre;
  }
  public void setEdad(int edad){
      this.edad = edad;
  }
  public void setTeléfono(String teléfono){
      this.teléfono = teléfono;
  }
// ---------------------------------------------------------------------------------------------------------------

    public String getNombre(){
      return nombre;
  }
    public int getEdad() {
        return edad;
    }
    public String getTeléfono(){
      return teléfono;
    }

}
