package com.example.ConceptosBasicos;

public class OperadoresTernarios {
    public static void main(String[] args) {
        //Ejemplos 
        int edad = 67;
        String resultado = (edad > 18) ? "Es mayor de edad" : (edad== 18) ? "Recien es mayor de edad" : "Es menor de edad" ; 
        System.out.println("La edad ingresada = " + edad + ", significa que " + resultado );

        boolean esDiaLaboral = false;
        String actividad = esDiaLaboral ? "Trabajar" : "Descansar";
        System.out.println("La actividad es " + actividad);
        
        String nombre = "Usuario";
        String nombreValidado = (nombre != null) ? nombre : "Invitado";
        System.out.println("El nombre ingresado es " + nombreValidado); //Preguntar

        int puntuacion = 85;
        String mensajeFinal = "Tu puntuación es " + ((puntuacion > 80) ? "alta" : "baja");
        System.out.println("Mensaje Final : " +mensajeFinal);

        boolean condicion1 = false, condicicion2= false;
        String mensajeBoolean= (condicion1 && condicicion2) ? "Ambas condiciones son verdaderas" : (condicion1 != condicicion2) ? "Al menos 1 es verdadero" : "Son falsas";
        System.out.println("La condicion es : "+ mensajeBoolean); 

    }
}
