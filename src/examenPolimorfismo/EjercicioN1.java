package examenPolimorfismo;

import java.util.Scanner;

public class EjercicioN1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Futbolista futbolista = new Futbolista();
        Entrenador entrenador = new Entrenador();
        Masajista masajista = new Masajista();
        String continuar;
        int edad, yearsExperiencia, idFederacion;
        String dorsal;
        char opc;

        do
        {
            System.out.println("Elije la opcion para llenar la informacion: \n Futbolista = f \n Entrenador = e \n Masajista = m");
             opc = entrada.nextLine().charAt(0);
            if(opc == 'f'){
                System.out.print("*Informacion del Futbolista*********** \n");
                System.out.println("Escriba el Id");
                futbolista.setId(entrada.nextInt());
                entrada.nextLine();
                System.out.print("Escriba el Nombre:");
                futbolista.setNombre(entrada.nextLine());
                System.out.print("Escriba el Apellido:");
                futbolista.setApelldio(entrada.nextLine());
                System.out.print("Escriba el Edad:");
                futbolista.setEdad(entrada.nextInt());
                System.out.print("Escriba el Dorsal:");
                 dorsal = entrada.nextLine();
                futbolista.setDorsal(entrada.nextLine());
                System.out.print("Escriba la Demacarcion:");
                futbolista.setDemarcacion(entrada.nextLine());
                System.out.println("");
                System.out.println("Nombre: " + futbolista.getNombres());
                System.out.println("Apellido: " + futbolista.getApellidos());
                System.out.println("Edad: " + futbolista.getEdad());
                System.out.println("Dorsal: " + futbolista.getDorsal());
                System.out.println("Demarcacion: " + futbolista.getDemarcacion());
                System.out.println("*");

            }if(opc == 'e'){
                System.out.print("Informacion del Entrenador¨************** \n");
                System.out.println("Escriba el Id");
                entrenador.setId(entrada.nextInt());
                entrada.nextLine();
                System.out.print("Escriba el Nombre:");
                entrenador.setNombre(entrada.nextLine());
                System.out.print("Escriba el Apellido:");
                entrenador.setApelldio(entrada.nextLine());
                System.out.print("Escriba el Edad:");
                entrenador.setEdad(entrada.nextInt());
                System.out.print("Escriba el IdFederacion:");
                entrenador.setIdFederacion(entrada.nextInt());
                entrada.nextLine();

                System.out.println();
                System.out.println("Nombre: " + entrenador.getNombres());
                System.out.println("Apellido: " + entrenador.getApellidos());
                System.out.println("Edad: " + entrenador.getEdad());
                System.out.println("IdFederacion: " + entrenador.getIdFederacion());
                System.out.println();

            }if (opc == 'm'){
                System.out.print("*Informacion del Masajista************* \n");
                System.out.println("Escriba el Id");
                masajista.setId(entrada.nextInt());
                entrada.nextLine();
                System.out.print("Escriba el Nombre:");
                masajista.setNombre(entrada.nextLine());
                System.out.print("Escriba el Apellido:");
                masajista.setApelldio(entrada.nextLine());
                System.out.print("Escriba el Edad:");
                masajista.setEdad(entrada.nextInt());
                entrada.nextLine();
                System.out.print("Escriba la titulacion:");
                masajista.setTitulacion(entrada.nextLine());
                System.out.print("Escriba los años de experiencia:");
                masajista.setAnioExperiencia(entrada.nextInt());
            entrada.nextLine();

                System.out.println();
                System.out.println("Nombre: " + masajista.getNombres());
                System.out.println("Apellido: " + masajista.getApellidos());
                System.out.println("Edad: " + masajista.getEdad());
                System.out.println("Titulacion" + masajista.getTitulacion());
                System.out.println("Años de experiencia: " + masajista.getYearsExperiencia());
                System.out.println();
            }
            System.out.println("¿Desea continuar registrando en el sistema? si=1, no=0");
            continuar = entrada.nextLine();
        }
        while (Integer.parseInt(continuar) == 1);
        System.out.println("Proceso terminado ¡Feliz dia!");

    }
}

class SuperClase{
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected int edad;

    public SuperClase(){}

    public SuperClase(int id, String nombres, String apellidos, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombre(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApelldio(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void consentrarse(){
        System.out.println(".......");
    }
    public void viajar(){
        System.out.println(".......");
    }
}

class Futbolista extends SuperClase{
    private String dorsal;
    private String demarcacion;

    public Futbolista(){}

    public Futbolista(int id, String nombres, String apellidos, int edad, String dorsal, String demarcacion) {
        super(id, nombres, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void JugarPartido(){
        System.out.println("Soy un futbolista y juego en el real madrid");
    }
    public void Entrenar(){
        System.out.println("Soy un futmolista y entreno 2 veces a la semana");
    }
    @Override
    public void consentrarse(){
        System.out.println("Soy un futbolista y necesito consentracion para mis partidos");
    }
    public void viajar(){
        System.out.println("Soy un futbolista y viajo a menudo");
    }
}

class Entrenador extends SuperClase{
    private int idFederacion;

    public Entrenador(){}

    public Entrenador(int id, String nombres, String apellidos, int edad, int idFederacion) {
        super(id, nombres, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){
        System.out.println("Soy un entrenador y dirijo partidos");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Soy y me encargo de dirigir los entrenamientos");
    }
    @Override
    public void consentrarse(){
        System.out.println("Soy un entrenador y necesito consentrame");
    }
    public void viajar(){
        System.out.println("Soy un entrenador y a menudo viajo");
    }
}
class Masajista extends SuperClase{
    private String titulacion;
    private int yearsExperiencia;

    public Masajista(){}

    public Masajista(int id, String nombres, String apellidos, int edad, String titulacion, int yearsEperiencia) {
        super(id, nombres, apellidos, edad);
        this.titulacion = titulacion;
        this.yearsExperiencia = yearsEperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getYearsExperiencia() {
        return yearsExperiencia;
    }

    public void setAnioExperiencia(int yearsExperiencia) {
        this.yearsExperiencia = yearsExperiencia;
    }

    public void darMasaje(){
        System.out.println("doy masajes ");
    }
    @Override
    public void consentrarse(){
        System.out.println("Soy un masajista y necesito consentrarme");
    }
    public void viajar(){
        System.out.println("Soy un masajista y me gusta viajar");
    }
}
