//Enumeración para el tipo de planeta
enum TipoPlaneta {
    GASEOSO, TERRESTRE, ENANO
}

public class Planeta {
    //Atributos
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private int distanciaMediaSol = 0;
    private TipoPlaneta tipo = null;
    private boolean observable = false;
    private double periodoOrbital; // Nuevo atributo
    private double periodoRotacion; // Nuevo atributo

    //Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaSol, TipoPlaneta tipo, boolean observable,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    //metodo para imprimir los datos del planeta
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia Media al Sol (millones km): " + distanciaMediaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable: " + observable);
        System.out.println("Periodo Orbital (años): " + periodoOrbital);
        System.out.println("Periodo de Rotación (días): " + periodoRotacion);
        System.out.println("Densidad: " + calcularDensidad());
        System.out.println("Es planeta exterior: " + esPlanetaExterior());
        System.out.println();
    }

    //metodo para calcular la densidad
    public double calcularDensidad() {
        return masa / volumen;
    }

    //metodo para determinar si es un planeta exterior
    public boolean esPlanetaExterior() {
        return distanciaMediaSol > 340; // Más allá del cinturón de asteroides
    }

    //metodo main para probar la clase
    public static void main(String[] args) {
        //Crear dos planetas
        Planeta p1 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778,
                TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta p2 = new Planeta("Marte", 2, 6.39e23, 1.6318e11, 6779, 228,
                TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

        //Imprimir los datos de ambos planetas
        p1.imprimir();
        p2.imprimir();
    }
}
