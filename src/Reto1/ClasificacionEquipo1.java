package Reto1;


public class ClasificacionEquipo1
{
    // Puntos que tiene el equipo
    private int e1p;
    // Partidos jugados por el equipo
    private int e1pj;
    // Partidos ganados por el equipo
    private int e1pg;
    // Partidos empatados por el equipo
    private int e1pe;
    // Partidos perdidos por el equipo
    private int e1pp;
    // Goles a favor del equipo
    private int e1gf;
    // Goles en contra del equipo
    private int e1gc;

    /**
     * Constructor para objetos de clasificacion de equipo. Este objeto recoje las estadisticas de la clasificacion de la liga para un equipo.
     * Este constructor inicializa todas las variables a 0.
     */
    public ClasificacionEquipo1()
    {
        // initialise instance variables
        this.e1p = 0;
        this.e1pj = 0;
        this.e1pg = 0;
        this.e1pe = 0;
        this.e1pp = 0;
        this.e1gf = 0;
        this.e1gc = 0;
    }

    
    public ClasificacionEquipo1(int puntos, int pj, int pg, int pe, int pp, int gf, int gc, int e1p, int e1pj, int e1pg, int e1pe, int e1pp, int e1gf, int e1gc)
    {
        // initialise instance variables
        this.e1p = e1p;
        this.e1pj = e1pj;
        this.e1pg = e1pg;
        this.e1pe = e1pe;
        this.e1pp = e1pp;
        this.e1gf = e1gf;
        this.e1gc = e1gc;
    }

    
    public void sumaEstadisticas(ClasificacionEquipo1 sumaEstadisticas)
    {
        e1p += sumaEstadisticas.getPuntos();
        e1pj += sumaEstadisticas.getPartidosJugados();
        e1pg += sumaEstadisticas.getPartidosGanados();
        e1pe += sumaEstadisticas.getPartidosEmpatados();
        e1pp += sumaEstadisticas.getPartidosPerdidos();
        e1gf += sumaEstadisticas.getGolesAFavor();
       e1gc += sumaEstadisticas.getGolesEnContra();
    }

    /**
     * Devuelve los puntos del equipo
     * @return los puntos del equipo
     */
    public int getPuntos()
    {
        return e1p;
    }

    /**
     * Devuelve los partidos jugados del equipo
     * @return los partidos jugados del equipo
     */
    public int getPartidosJugados()
    {
        return e1pj;
    }

    /**
     * Devuelve los partidos ganados del equipo
     * @return los partidos ganados del equipo
     */
    public int getPartidosGanados()
    {
        return e1pg;
    }

    /**
     * Devuelve los partidos empatados del equipo
     * @return los partidos empatados del equipo
     */
    public int getPartidosEmpatados()
    {
        return e1pe;
    }

    /**
     * Devuelve los partidos perdidos del equipo
     * @return los partidos perdidos del equipo
     */
    public int getPartidosPerdidos()
    {
        return e1pp;
    }

    /**
     * Devuelve los goles a favor del equipo
     * @return los goles a favor del equipo
     */
    public int getGolesAFavor()
    {
        return e1gf;
    }

    /**
     * Devuelve los goles en contra del equipo
     * @return los goles en contra del equipo
     */
    public int getGolesEnContra()
    {
        return e1gc;
    }

    /**
     * Devuelve la diferencia de goles a favor y en contra del equipo
     * @return la diferencia de goles a favor y en contra del equipo
     */
    public int getDiferenciaDeGoles()
    {
        return (e1gf - e1gc);
    }
    
    /**
     * Devuelve la informacion de la clasificacion del equipo
     * @return un String con la informacion de la clasificacion del equipo
     */
    public String toString()
    {
        return (e1p + "\t" + e1pj + "\t" + + e1pg + "\t" + e1pe + "\t" + e1pp + "\t" + e1gf + "\t" + e1gc + "\t" + getDiferenciaDeGoles());
    }
}