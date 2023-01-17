public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Ulises");
        persona.setEdad(24);
        persona.setTelefono(33105093);

        System.out.println("Mi nombre es: "+persona.getNombre());
        System.out.println("Mi edad es: "+persona.getEdad());
        System.out.println("Mi telefono es: "+persona.getTelefono());
    }
}

    class Persona{
        private int edad;
        private String nombre;
        private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    }