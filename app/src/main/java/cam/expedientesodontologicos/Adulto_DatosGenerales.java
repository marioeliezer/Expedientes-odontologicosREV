package cam.expedientesodontologicos;

public class Adulto_DatosGenerales {
String nombre,sexo,estado_civil,direccion,emergencia,procedencia,telefono,ocupacion,referencia,fecha_inicio;
Long edad;

    public Adulto_DatosGenerales(String nombre, String sexo, String estado_civil, String direccion, String emergencia, String procedencia, String telefono, String ocupacion, String referencia, String fecha_inicio, Long edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.direccion = direccion;
        this.emergencia = emergencia;
        this.procedencia = procedencia;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.referencia = referencia;
        this.fecha_inicio = fecha_inicio;
        this.edad = edad;
    }

    public Adulto_DatosGenerales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }
}
