public class Persona {
   private String nombre;
   private String edad;
   private String telefono;

   public void setEdad(String edad) {
       this.edad = edad;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public void setTelefono(String telefono){
      this.telefono = telefono;
   }
   public String getNombre(){
       return nombre;
   }
   public String getEdad(){
       return edad;
   }
   public String getTelefono(){
       return telefono;
   }

}
class Cliente extends Persona{
     private String credito;

     public void setCredito(String credito){
         this.credito = credito;
     }
     public String getCredito(){
         return credito;
     }

}
class Trabajador extends Persona{
    private String salario;

    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return salario;
    }

}


