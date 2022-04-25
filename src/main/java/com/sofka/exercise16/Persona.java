package com.sofka.exercise16;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;
    private Character sexo;
    private Double peso;
    private Double altura;

    public static final int PESO_INFERIOR = -1;
    public static final int PESO_IDEAL = 0;
    public static final int PESO_SOBREPESO = 1;

    public Persona(){
        this.nombre ="";
        this.edad=0;
        this.sexo='H';
        this.peso=0.0;
        this.altura=0.0;
        generaDNI();
    }

    public Persona(String nombre, Integer edad,Character sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso=0.0;
        this.altura=0.0;
        generaDNI();

    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();

    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    @Override
    public String toString(){
        String personaInfo = "-------------Info de persona-------------" + "\n"
                            + "Nombre: " + this.nombre + "\n"
                            + "Edad: " + this.edad + "\n"
                            + "Sexo: " + this.sexo + "\n"
                            + "DNI: " + this.DNI + "\n"
                            + "Peso: " + this.peso + "\n"
                            + "Altura: " + this.altura + "\n";
        return personaInfo;
    }

    public void comprobarSexo(char sexo){
        if( sexo != this.sexo ){
            this.sexo = 'H';
        }
    }

    public void generaDNI(){
        int DNINumbers = (int)Math.floor(Math.random() * (99999999 - 10000000 + 1) + 10000000);
        char DNILetter = calcularLetra(DNINumbers);
        this.DNI = Integer.toString(DNINumbers) + DNILetter;
    }

    public char calcularLetra(int DNI){
        String letters ="TRWAGMYFPDXBNJZSQVHLCKE";
        int rest = DNI % 23;
        return letters.charAt(rest);
    }

    public int calcularIMC(){
        double IMC = this.peso/ Math.pow(this.altura,2);
        if(IMC < 20){
            return PESO_INFERIOR;
        } else if (IMC >=20 && IMC <=25){
            return PESO_IDEAL;
        } else if (IMC > 25){
            return PESO_SOBREPESO;
        }
        return 2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
