import java.util.Scanner;

public class Calculadora {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
 
    int opcion;
    
     System.out.println("Bienvenido a la calculadora en consola de Esteban Valverde");
     System.out.println();
     do {
        Menu();
        opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Division();
                break;
            case 5:
                Salir();
                break;
            default:
                errores(1);
                break;
        }
     } while (opcion != 5);

 }

 public static void Menu(){
     System.out.println("Menu");
     System.out.println("1. Suma");
     System.out.println("2. Resta");
     System.out.println("3. Multiplicacion");
     System.out.println("4. Division");
     System.out.println("5. Salir");
 }

public static void Suma(){
    System.out.println("SUMA:");
    System.out.println("Para ver la suma de todos los numeros ingresados digitar '%'.");
    String cadena;
    double resultado = 0;

    do {

        do {
        cadena = teclado.nextLine();
        } while (!esnumero(cadena) && !cadena.equals("%"));
        
        if (cadena.equals("%")) {
            System.out.println("La suma es " + resultado);    
        } else {
            resultado = resultado + Double.parseDouble(cadena);
        }
    } while (!cadena.equals("%"));
    
}
public static void Resta(){
    System.out.println("RESTA:");
    System.out.println("Solo podra realizar resta de dos valores.");

    String num1;
    String num2;
    double resultado = 0;

    do {
    System.out.print("Valor 1: ");
        num1 = teclado.nextLine();    
    } while (!esnumero(num1));
    do {
        System.out.print("Valor 2: ");    
        num2 = teclado.nextLine();
    } while (!esnumero(num2));
    resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
    System.out.println("El resultado de la resta es " + resultado);

}
public static void Multiplicacion(){
    System.out.println("Multiplicacion:");
    System.out.println("Para ver la multiplicacion de todos los numeros ingresados digitar '%'.");
    String cadena;
    double resultado = 1;

    do {
        do {
        cadena = teclado.nextLine();
        } while (!esnumero(cadena) && !cadena.equals("%"));

        if (cadena.equals("%")) {
            System.out.println("El producto es " + resultado);     
        } else {
        resultado = resultado*Double.parseDouble(cadena);   
                }
    } while (!cadena.equals("%"));
    
}
public static void Division(){
    System.out.println("DIVISION:");
    System.out.println("Solo podra realizar division de dos valores.");

    String num1;
    String num2;
    double resultado = 0;

    do {
    System.out.print("Valor 1: ");
        num1 = teclado.nextLine();    
    } while (!esnumero(num1));
    do {
        System.out.print("Valor 2: ");    
        num2 = teclado.nextLine();
    } while (!esnumero(num2));
    resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
    System.out.println("El resultado de la division es " + resultado);

}
public static void Salir(){
System.out.println("Gracias");
}
public static void errores(int tipo){
    if (tipo == 1) {
    System.out.println("¡Opcion invalida!");
    } else if (tipo == 2) {
    System.out.println("No es un numero");
    }
}
public static boolean esnumero(String cadena){
    boolean resultado;
    resultado = false;
    try {
        Double.parseDouble(cadena);
        resultado = true;
    } catch (NumberFormatException nfe) {
        if (!cadena.equals("%")){
            errores(2);
        }
    }
    return resultado;
}
}