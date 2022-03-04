/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7progra2_favionataren_22141210;

/**
 *
 * @author favio
 */
public class Equipos {

    String nombre;
    int partidosJugados;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    int golesAFabor;
    int golesEnContra;
    int diferencia;
    int puntos;

    public Equipos(String nombre, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFabor, int golesEnContra, int diferencia, int puntos) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesAFabor = golesAFabor;
        this.golesEnContra = golesEnContra;
        this.diferencia = diferencia;
        this.puntos = puntos;
    }

    public Equipos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesfabor() {
        return golesAFabor;
    }

    public void setGolesfabor(int golesAFabor) {
        this.golesAFabor = golesAFabor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golescontra) {
        this.golesEnContra = golescontra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre + ", partidosJugados=" + partidosJugados + ", partidosGanados=" + partidosGanados + ", partidosEmpatados=" + partidosEmpatados + ", partidosPerdidos=" + partidosPerdidos + ", golesAFabor=" + golesAFabor + ", golesEnContra=" + golesEnContra + ", diferencia=" + diferencia + ", puntosts=" + puntos + '}';
    }

}
