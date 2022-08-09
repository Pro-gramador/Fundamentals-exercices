public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Bryant");
        persona.setEdad(18);
        persona.setTeléfono("829-874-4466");

        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Teléfono: "+persona.getTeléfono());      

    }
}