import java.util.Date;
import java.util.List;

public class Medico {
    private String codMedico;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String DNI;
    private Date fechaNacimiento;
    private List<Servicio> servicios;

    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, List<Servicio> servicios) {
        this.setCodMedico(codMedico);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDNI(DNI);
        this.setFechaNacimiento(fechaNacimiento);
        this.setServicios(servicios);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico='" + codMedico + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
