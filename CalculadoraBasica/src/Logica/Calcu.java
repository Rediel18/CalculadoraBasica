
package Logica;

import java.util.Scanner;

public class Calcu extends Calculadora {

    public static void main(String[] args) {
        Calculadora c=new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		c.setNum1(sc.nextInt());
		System.out.println("Ingrese otro numero");
		c.setNum2(sc.nextInt());
		c.sumar();
                c.restar();
                c.multiplicar();
                c.dividir();
		System.out.println("La suma es: " + c.suma +
                            "\nla resta es: " + c.resta +
                            "\nla multiplicacion es: " + c.multiplicacion +
                            "\nla division es: " + c.division);
    }
    
}
