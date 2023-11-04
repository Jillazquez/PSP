import java.util.Scanner;

public class Actividad1x01
{
    public static void main(String[] args) {
        Fibo hilo = new Fibo();
        hilo.start();
        System.out.println("Fin del programa");
    }
}

class Fibo extends Thread{


    public void run(){
        Scanner teclado = new Scanner(System.in);
        int limite;
        long actual=1,anterior=0,suma=1;
        System.out.println("Hasta donde quieres:");
        limite = teclado.nextInt();
        teclado.nextLine();//Consumo el salto de linea
        teclado.close();



        for(int i = 0;i < limite ;i++){
            System.out.print(suma+",");
            suma = actual+anterior;
            anterior = actual;
            actual = suma;
            
        }
    }
}