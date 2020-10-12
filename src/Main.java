import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Paciente juan = new Paciente("Juan","Perez","Zeballos","11232");
        juan.setNombre("Juan Luis");

        System.out.println(juan);
        System.out.println(juan.getNombre());
        System.out.println(juan.getPrimerApellido());
        System.out.println(juan.getSegundoApellido());





    }

}
