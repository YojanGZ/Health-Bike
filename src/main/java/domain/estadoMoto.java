package domain;

import java.time.LocalDate;

public class estadoMoto {
    private String estadoId;
    private String piezasMoto;
    private String estadoPiezas;
    private String reparacionesMoto;
    private LocalDate fechaReparacion;

    public estadoMoto(String estadoId, String piezasMoto, String estadoPiezas, String reparacionesMoto, LocalDate fechaReparacion) {
        this.estadoId = estadoId;
        this.piezasMoto = piezasMoto;
        this.estadoPiezas = estadoPiezas;
        this.reparacionesMoto = reparacionesMoto;
        this.fechaReparacion = fechaReparacion;
    }

    public String getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public String getPiezasMoto() {
        return piezasMoto;
    }

    public void setPiezasMoto(String piezasMoto) {
        this.piezasMoto = piezasMoto;
    }

    public String getEstadoPiezas() {
        return estadoPiezas;
    }

    public void setEstadoPiezas(String estadoPiezas) {
        this.estadoPiezas = estadoPiezas;
    }

    public String getReparacionesMoto() {
        return reparacionesMoto;
    }

    public void setReparacionesMoto(String reparacionesMoto) {
        this.reparacionesMoto = reparacionesMoto;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }
}
