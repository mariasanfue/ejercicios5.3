/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 * Clase para Pakemons
 * Versión 0.1
 * https://github.com/PacoIESJM/ExamDistancia.git
 * @author PACO
 * @author María Sanz Fuentes
 */
public class Pakemon {
    /**
     * nombreJugador - Nombre del jugador, se pide al crear el juego
     */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    /**
     * juegoPasado - Indica si se ha pasado el juego o aún no
     */
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    /**
     * pakemonCapturados - Indica los pakemon que tiene el jugador en su poder
     */
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    /**
     * pakeballs - Disponibles para capturar pakemons
     */
    private int pakeballs; //disponibles para capturar pakemons

    
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * Método para capturar Pakemons
     * @param nombrePakemon Nombre del Pakemon a capturar
     * @return true si se capturó el Pakemon, false en caso contrario
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }

    /**
     * Método para coger Pakeballs. Suma uno a las Pakeballs disponibles.
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     * Método para decir la clave final y comprobar si es correcta.
     * @param claveFin
     * @return mensaje
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    /**
     * Getter para nombreJugador
     * @return nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * Setter para nombreJugador
     * @param nombreJugador nuevo nombre del jugador
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * Getter para juegoPasado
     * @return juegoPasado
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    /**
     * Setter para juegoPasado
     * @param juegoPasado nuevo estado de juegoPasado
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * Getter para pakemonCapturados
     * @return pakemonCapturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * Setter para pakemonCapturados
     * @param pakemonCapturados nuevo número de Pakemons capturados
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * Getter para pakeballs
     * @return pakeballs
     */
    public int getPakeballs() {
        return pakeballs;
    }

    /**
     * Setter para pakeballs
     * @param pakeballs nuevo número de pakeballs
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
