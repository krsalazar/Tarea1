import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre =  teclado.nextLine();
        System.out.println("Bienvenido a Progra 2 2022 "+nombre);
        System.out.println("Esta tarea ahora está en GIT");
    }
}