package com.sofka.exercise18;

public class eigtheenExercise {
    public static void main(String[] args) {

        Serie houseOfCards = new Serie();
        Serie theWalkingDead = new Serie("The Waling Dead", 10, "Horror", "Daniel Sackheim");
        Serie theSimpsons = new Serie("The Simpsons", "Matt Groening");
        Serie futurama = new Serie("Futurama", "Matt Groening");
        Serie opm = new Serie();

        Videojuego halo = new Videojuego();
        Videojuego zelda = new Videojuego("Zelda",20.0,"Action","Nintendo");
        Videojuego mario = new Videojuego("Mario",20.0);
        Videojuego metroid = new Videojuego();
        Videojuego lastOfUs = new Videojuego("The last of Us", 25.0);

        Serie[] series = {houseOfCards, theWalkingDead, theSimpsons, futurama, opm};
        Videojuego[] videojuegos = {halo,zelda,mario,metroid,lastOfUs};

        futurama.entregar();
        theSimpsons.entregar();
        halo.entregar();
        metroid.entregar();
        mario.entregar();

        System.out.println("Series entregadas: " + countDelivered(series));
        System.out.println("Videojuegos entregados: " + countDelivered(videojuegos));

        System.out.println("\nVideojuego con más horas estimadas\n" + mostHoursVideogame(videojuegos).toString());
        System.out.println("Serie con mas temporadas\n" + mostSeasonsSerie(series).toString());


    }

    public static Serie mostSeasonsSerie(Serie[] series){
        int numSeasons = 0;
        Serie mostSeasosnSerie = new Serie();
        for (Serie serie: series) {
            if(serie.getNumSeasons() > numSeasons){
                numSeasons = serie.getNumSeasons();
                mostSeasosnSerie = serie;
            }
        }
        return mostSeasosnSerie;
    }

    public static Videojuego mostHoursVideogame(Videojuego[] videogames){
        double numHours = 0;
        Videojuego mostHoursGame = new Videojuego();
        for (Videojuego game : videogames) {
            if(game.getEstimatedHours() > numHours) {
                numHours = game.getEstimatedHours();
                mostHoursGame = game;
            }
        }
        return mostHoursGame;
    }

    public static int countDelivered(Serie[] series){
        int countSeries = 0;
        for (int i = 0; i < series.length - 1; i++) {
            if (series[i].isEntregado()){
                countSeries+=1;
                series[i].devolver();
            }
        }
        return countSeries;
    }

    public static int countDelivered(Videojuego[] videogames){
        int countVideogames = 0;
        for (int i = 0; i < videogames.length - 1; i++) {
            if (videogames[i].isEntregado()){
                countVideogames+=1;
                videogames[i].devolver();
            }
        }
        return countVideogames;
    }



}
