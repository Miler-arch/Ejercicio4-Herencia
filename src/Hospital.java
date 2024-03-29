import java.util.List;

public class Hospital {
    private String codHospital;
    private String nombre;
    private Ciudad ciudad;
    private int telefono;
    private List<Servicio> servico;
    private Medico director;

    public Hospital(String nombre) {
        this.setCodHospital(codHospital);
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setTelefono(telefono);
        this.setServico(servico);
        this.setDirector(director);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", director=" + director +
                '}';
    }

    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Servicio> getServico() {
        return servico;
    }

    public void setServico(List<Servicio> servico) {
        this.servico = servico;
    }

    public Medico getDirector() {
        return director;
    }

    public void setDirector(Medico director) {
        this.director = director;
    }
}
