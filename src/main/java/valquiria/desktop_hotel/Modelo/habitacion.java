package valquiria.desktop_hotel.Modelo;

public class habitacion {
    private int idhabitacion;
    private int num_habitacion;
    private Double precio;
    private String tipo_habitacion;
    private String estado;
    private int piso;

    public habitacion() {
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public habitacion(int idhabitacion, int num_habitacion, Double precio, String tipo_habitacion, String estado) {
        this.idhabitacion = idhabitacion;
        this.num_habitacion = num_habitacion;
        this.precio = precio;
        this.tipo_habitacion = tipo_habitacion;
        this.estado = estado;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
