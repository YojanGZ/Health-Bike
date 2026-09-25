package domain;

public class recordatorio {
    private int recordatorioId;
    private String notificacionR;
    private String estadoRepuesto;
    private String descripcionRecordatorio;

    public recordatorio(int recordatorioId, String notificacionR, String estadoRepuesto, String descripcionRecordatorio) {
        this.recordatorioId = recordatorioId;
        this.notificacionR = notificacionR;
        this.estadoRepuesto = estadoRepuesto;
        this.descripcionRecordatorio = descripcionRecordatorio;
    }

    public int getRecordatorioId() {
        return recordatorioId;
    }

    public void setRecordatorioId(int recordatorioId) {
        this.recordatorioId = recordatorioId;
    }

    public String getNotificacionR() {
        return notificacionR;
    }

    public void setNotificacionR(String notificacionR) {
        this.notificacionR = notificacionR;
    }

    public String getEstadoRepuesto() {
        return estadoRepuesto;
    }

    public void setEstadoRepuesto(String estadoRepuesto) {
        this.estadoRepuesto = estadoRepuesto;
    }

    public String getDescripcionRecordatorio() {
        return descripcionRecordatorio;
    }

    public void setDescripcionRecordatorio(String descripcionRecordatorio) {
        this.descripcionRecordatorio = descripcionRecordatorio;
    }
}
