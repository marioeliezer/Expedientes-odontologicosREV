package cam.expedientesodontologicos;

public class Lista_pacientes {
    String nombre;
    int imagen;

    public Lista_pacientes() {
    }

    public Lista_pacientes(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}