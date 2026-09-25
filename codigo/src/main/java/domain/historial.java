package domain;

import java.time.LocalDate;

public class historial {
    private int historialId;
    private LocalDate fechaHistorial;
    private String nomTaller;
    private String tipoMantenimiento;
    private String descripcionMantenimiento;

    public historial(int historialId, LocalDate fechaHistorial, String nomTaller, String tipoMantenimiento, String descripcionMantenimiento) {
        this.historialId = historialId;
        this.fechaHistorial = fechaHistorial;
        this.nomTaller = nomTaller;
        this.tipoMantenimiento = tipoMantenimiento;
        this.descripcionMantenimiento = descripcionMantenimiento;
    }

    public int getHistorialId() {
        return historialId;
    }

    public void setHistorialId(int historialId) {
        this.historialId = historialId;
    }

    public LocalDate getFechaHistorial() {
        return fechaHistorial;
    }

    public void setFechaHistorial(LocalDate fechaHistorial) {
        this.fechaHistorial = fechaHistorial;
    }

    public String getNomTaller() {
        return nomTaller;
    }

    public void setNomTaller(String nomTaller) {
        this.nomTaller = nomTaller;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }


}
