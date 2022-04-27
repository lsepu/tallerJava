package com.sofka.exercise18;

public class Videojuego implements IEntregable {

    private String title;
    private Double estimatedHours;
    private Boolean delivered;
    private String genre;
    private String company;

    private static final Double DEFAULT_ESTIMATED_HOURS = 10.0;
    private static final Boolean DEFAULT_DELIVERED = false;
    private static final String DEFAULT_TITLE = "No title";
    private static final String DEFAULT_GENRE = "No genre";
    private static final String DEFAULT_COMPANY = "No company";


    public Videojuego() {
        this.title = DEFAULT_TITLE;
        this.estimatedHours = DEFAULT_ESTIMATED_HOURS;
        this.delivered = DEFAULT_DELIVERED;
        this.genre = DEFAULT_GENRE;
        this.company = DEFAULT_COMPANY;
    }

    public Videojuego(String title, Double estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = DEFAULT_DELIVERED;
        this.genre = DEFAULT_GENRE;
        this.company = DEFAULT_COMPANY;
    }

    public Videojuego(String title, Double estimatedHours, String genre, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.genre = genre;
        this.company = company;
        this.delivered = DEFAULT_DELIVERED;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString(){
        String gameInfo = "-------------Juego------------" + "\n"
                + "Título: " + this.title + "\n"
                + "Num de horas: " + this.estimatedHours + "\n"
                + "Genero: " + this.genre + "\n"
                + "Compañía: " + this.company + "\n"
                + "Prestado: " + (this.delivered ? "Sí" : "No") + "\n";
        return gameInfo;

    }

    @Override
    public void entregar() {
        this.delivered = true;
    }

    @Override
    public void devolver() {
        this.delivered = false;
    }

    @Override
    public boolean isEntregado() {
        return this.delivered;
    }

    @Override
    public int compareTo(Object game) {
        Videojuego gameCast = (Videojuego) game;
        if(this.estimatedHours > gameCast.getEstimatedHours()){
            return 1;
        } else if ( this.estimatedHours > gameCast.getEstimatedHours() ){
            return -1;
        }
        return 0;
    }
}
