import java.util.Date;

public class Paciente extends Persona{
    private String numeroSeguridadSocial;

    public Paciente(String nombre, String primerApellido, String segundoApellido, String numeroSeguridadSocial) {
        super(nombre,primerApellido,segundoApellido);

        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
    }



    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
