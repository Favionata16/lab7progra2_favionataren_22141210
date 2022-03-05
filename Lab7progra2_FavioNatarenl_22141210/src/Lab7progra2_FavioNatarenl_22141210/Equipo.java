package Lab7progra2_FavioNatarenl_22141210;

/**
 *
 * @author favio
 */
public class Equipo {
    String nombre;
    int parjuga;
    int pargana;
    int parempa;
    int parperdi;
    int golesfabor;
    int golescontra;
    int diferencia;
    int pts;
    public Equipo(String nombre, int parjuga, int pargana, int parempa, int parperdi, int golesfabor, int golescontra, int diferencia, int pts) {
        this.nombre = nombre;
        this.parjuga = parjuga;
        this.pargana = pargana;
        this.parempa = parempa;
        this.parperdi = parperdi;
        this.golesfabor = golesfabor;
        this.golescontra = golescontra;
        this.diferencia = diferencia;
        this.pts = pts;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return parjuga;
    }

    public void setPartidosJugados(int parjuga) {
        this.parjuga =+ parjuga;
    }

    public int getPartidosGanados() {
        return pargana;
    }

    public void setPartidosGanados(int pargana) {
        this.pargana =+ pargana;
    }

    public int getPartidosEmpatados() {
        return parempa;
    }

    public void setPartidosEmpatados(int parempa) {
        this.parempa =+ parempa;
    }

    public int getParperdi() {
        return parperdi;
    }

    public void setParperdi(int parperdi) {
        this.parperdi =+ parperdi;
    }

    public int getGolesfabor() {
        return golesfabor;
    }

    public void setGolesfabor(int golesfabor) {
        this.golesfabor =+ golesfabor;
    }

    public int getGolescontra() {
        return golescontra;
    }

    public void setGolescontra(int golescontra) {
        this.golescontra =+ golescontra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts =+ pts;
    }
    @Override
    public String toString() {
        return  nombre;
    }    
}
