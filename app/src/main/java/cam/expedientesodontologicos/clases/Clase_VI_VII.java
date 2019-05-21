package cam.expedientesodontologicos.clases;

public class Clase_VI_VII {
    private String historia_fam;
    private String historia_per;

    public Clase_VI_VII(String historia_fam, String historia_per) {
        this.historia_fam = historia_fam;
        this.historia_per = historia_per;
    }

    public String getHistoria_fam() {
        return historia_fam;
    }

    public void setHistoria_fam(String historia_fam) {
        this.historia_fam = historia_fam;
    }

    public String getHistoria_per() {
        return historia_per;
    }

    public void setHistoria_per(String historia_per) {
        this.historia_per = historia_per;
    }
}
