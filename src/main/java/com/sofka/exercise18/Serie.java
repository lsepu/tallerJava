package com.sofka.exercise18;

public class Serie implements IEntregable {
    private String title;
    private Integer numSeasons;
    private Boolean delivered;
    private String genre;
    private String creator;

    private static final Integer DEFAULT_NUM_SEASONS = 3;
    private static final Boolean DEFAULT_DELIVERED = false;
    private static final String DEFAULT_GENRE = "No genre";
    private static final String DEFAULT_TITLE = "No title";
    private static final String DEFAULT_CREATOR = "No information";


    public Serie() {
        this.title = DEFAULT_TITLE;
        this.numSeasons = DEFAULT_NUM_SEASONS;
        this.delivered = DEFAULT_DELIVERED;
        this.genre = DEFAULT_GENRE;
        this.creator = DEFAULT_CREATOR;
    }

    public Serie(String title, Integer numSeasons, String genre, String creator) {
        this.title = title;
        this.numSeasons = numSeasons;
        this.genre = genre;
        this.creator = creator;
        this.delivered = DEFAULT_DELIVERED;
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
        this.genre = DEFAULT_GENRE;
        this.numSeasons = DEFAULT_NUM_SEASONS;
        this.delivered = DEFAULT_DELIVERED;
    }


    public String getTitle() {
        return title;
    }

    public Integer getNumSeasons() {
        return numSeasons;
    }

    public String getGenre() {
        return genre;
    }

    public String getCreador() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumSeasons(Integer numSeasons) {
        this.numSeasons = numSeasons;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCreador(String creator) {
        this.creator = creator;
    }



    @Override
    public String toString() {
        String serieInfo = "-------------Serie------------" + "\n"
                + "Título: " + this.title + "\n"
                + "Num de temporadas: " + this.numSeasons + "\n"
                + "Genero: " + this.genre + "\n"
                + "Creador: " + this.creator + "\n"
                + "Prestado: " + (this.delivered ? "Sí" : "No") + "\n";
        return serieInfo;
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
    public int compareTo(Object serie) {
        Serie serieCast = (Serie) serie;
        if (this.numSeasons > serieCast.getNumSeasons()) {
            return 1;
        } else if (this.numSeasons < serieCast.numSeasons) {
            return -1;
        }
        return 0;
    }
}
