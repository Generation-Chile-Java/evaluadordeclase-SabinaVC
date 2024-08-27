import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("¡Bienvenido!");

        System.out.println("Ingrese la calificación de la primera materia:");
        int primeraCalificacion = miScanner.nextInt();

        System.out.println("Ingrese la calificación de la segunda materia:");
        int segundaCalificacion = miScanner.nextInt();

        System.out.println("Ingrese la calificación de la tercera materia:");
        int terceraCalificacion = miScanner.nextInt();


        System.out.println("Evaluación de la primera materia: " + evaluarCalificacion(primeraCalificacion));
        System.out.println("Evaluación de la segunda materia: " + evaluarCalificacion(segundaCalificacion));
        System.out.println("Evaluación de la tercera materia: " + evaluarCalificacion(terceraCalificacion));
    }

    private static String evaluarCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            return "Entrada inválida";
        } else if (calificacion <= 3) {
            return "No Aprobado";
        } else if (calificacion <= 5) {
            return "Insuficiente";
        } else if (calificacion <= 8) {
            return "Aceptable";
        } else if (calificacion == 10) {
            return "Excelente";
        } else {
            return "Calificación no válida";
        }
    }
}
