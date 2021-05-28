package Ejercicio16;

public class Persona {
    private String nombre="";
    private String DNI;
    private char sexo='H';
    private double peso=0;
    private double altura=0;
    private int edad=0;

    public Persona() {
       this.DNI=generaDNI();
    }

    public Persona(String nombre, char sexo, int edad) {
        this.DNI=generaDNI();
        this.nombre = nombre;
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
    }

    public Persona(String nombre, char sexo, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.DNI = generaDNI();;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    //MODIFICADORES DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String generaDNI(){
        int numero= this.generaDNINumero();
        String letra = this.generaDNILetra(numero);
        return  Integer.toString(numero)+"-"+letra;
    }

    private String generaDNILetra(int numero) {
        String cad="TRWAGMYFPDXBNJZSQVHLCKET";
        int pos = numero % 23;
        String letra = cad.substring(pos,pos+1);
        return letra;
    }

    private int generaDNINumero() {
        double numero = Math.random() * (100000000 - 10000000);
        return (int) Math.floor(numero) + 10000000;
    }

    public int calcularIMC(){
        double IMC = this.peso/(Math.pow(this.altura,2));
        if (IMC>=20 && IMC<=25)
            return 0;
        if (IMC<20)
            return -1;
        return 1;
    }

    public boolean esMayorDeEdad(){
        return this.edad>=18?true:false;
    }

    private char comprobarSexo(char sexo){
        sexo= Character.toUpperCase(sexo);
        return   (sexo == 'H' || sexo== 'M')? sexo :'H';
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}
