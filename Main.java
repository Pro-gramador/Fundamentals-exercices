
public class Main {

    public static void main(String[] args) {
    Cliente cliente = new Cliente();

    cliente.setNombre("Daniela");
    cliente.setEdad("18");
    cliente.setTelefono("829-771-0200");
    cliente.setCredito("123456789");

    System.out.println("Nombre:"+" "+ cliente.getNombre());
    System.out.println("Edad:"+" "+ cliente.getEdad());
    System.out.println("Teléfono:"+" "+ cliente.getTelefono());
    System.out.println("Crédito:"+" "+ cliente.getCredito());
    System.out.println();

    //--------------------------------------------------------------------------------------------------------

     Trabajador trabajador = new Trabajador();
     trabajador.setNombre("Bryant");
     trabajador.setEdad("18");
     trabajador.setTelefono("829-899-0909");
     trabajador.setSalario("500.000");

     System.out.println("Nombre:"+" "+ trabajador.getNombre());
     System.out.println("Edad:"+" "+ trabajador.getEdad());
     System.out.println("Teléfono:"+" "+ trabajador.getTelefono());
     System.out.println("Salario neto mensual:"+" "+ trabajador.getSalario());

 }

        }





