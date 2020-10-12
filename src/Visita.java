import java.util.Date;

public class Visita {
    private String codVisita;
    private Date fechaHora;
    private Hospital hospital;
    private Servicio servicio;
    private Medico medico;
    private String diagnostico;
    private String tratamientos;
    private int numeroCama;
    private Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numeroCama, Historial historial) {
        this.setCodVisita(codVisita);
        this.setFechaHora(fechaHora);
        this.setHospital(hospital);
        this.setServicio(servicio);
        this.setMedico(medico);
        this.setDiagnostico(diagnostico);
        this.setTratamientos(tratamientos);
        this.setNumeroCama(numeroCama);
        this.setHistorial(historial);
    }

    @Override
    public String toString() {
        return "Visita{" +
                "fechaHora=" + fechaHora +
                '}';
    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
