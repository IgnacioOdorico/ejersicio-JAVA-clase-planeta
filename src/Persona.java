public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento; // Nuevo atributo
    private char genero;           // Nuevo atributo

    // Constructor
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,
                   int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    //Metodo para imprimir los datos de la persona
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de Documento: " + numeroDocumentoIdentidad);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println();
    }

    //metodo main para probar la clase
    public static void main(String[] args) {
        // Crear dos personas
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Chile", 'H');

        // Imprimir los datos de ambas personas
        p1.imprimir();
        p2.imprimir();
    }
}
