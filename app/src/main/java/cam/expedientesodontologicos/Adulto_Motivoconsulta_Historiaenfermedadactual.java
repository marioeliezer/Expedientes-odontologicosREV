package cam.expedientesodontologicos;

public class Adulto_Motivoconsulta_Historiaenfermedadactual {
    String motivo_consulta,enfermedad_actual;

    public Adulto_Motivoconsulta_Historiaenfermedadactual() {
    }

    public Adulto_Motivoconsulta_Historiaenfermedadactual(String motivo_consulta, String enfermedad_actual) {
        this.motivo_consulta = motivo_consulta;
        this.enfermedad_actual = enfermedad_actual;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getEnfermedad_actual() {
        return enfermedad_actual;
    }

    public void setEnfermedad_actual(String enfermedad_actual) {
        this.enfermedad_actual = enfermedad_actual;
    }
}
