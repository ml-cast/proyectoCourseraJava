public class Serie {

    String titulo;
    int temporadas=1;
    boolean visto=false;
    String genero;
    String creador;
    double duracion=0.0;

    public Serie(){
        this.titulo="lo que sea";
        this.genero="el que sea";
        this.creador="quien sea";
        this.duracion=duracion;
        this.temporadas=temporadas;
        this.visto=visto;

    }

    public Serie(String titulo,String creador){
        this.titulo=titulo;
        this.creador=creador;

    }

    public Serie(String titulo,String genero,String creador,int temporadas,double duracion){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.temporadas=temporadas;
        this.duracion=duracion;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
