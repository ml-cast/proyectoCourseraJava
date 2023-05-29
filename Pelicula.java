public class Pelicula {

    String titulo;

    String genero;
    String creador;
    int anio;
    double duracion;
    boolean visto;

    //Pelicula titulo= new Pelicula();
    //Pelicula creador=new Pelicula();

    //método constructor por default
    public Pelicula() {
        this.genero="genero";
        this.duracion=0.0;
        this.anio=1900;
        this.visto=false;

    }
    //método constructor con título y creador
    public Pelicula (String titulo,String creador){

        this.titulo=titulo;
        this.creador=creador;

    }

    public Pelicula(String titulo,String genero,String creador,int anio,double duracion) {
    this.titulo=titulo;
    this.genero=genero;
    this.creador=creador;
    this.anio=anio;
    this.duracion=duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
