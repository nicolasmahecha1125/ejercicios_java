package ejercicioCuentaBanco;
import java.util.Scanner;
public class Banco {
    private Persona persona;
    private Cuenta[] cuenta1;
    private int contadorCuenta = 0;

    Scanner scanner = new Scanner(System.in);

    public Banco(Persona persona){
        this.persona = persona;
        this.cuenta1 = new Cuenta[2];

    }

    public  void agregarCuenta(Cuenta Cuenta){
        this.cuenta1[contadorCuenta] = Cuenta;
        this.contadorCuenta++;

    }
    public void transferencia(Cuenta cuenta1,Cuenta cuenta2){
        System.out.println("opcion 1 : pasar la cuenta 2 a la 1");
        System.out.println("opcion 2 : pasar la cuenta 1 a la 2");
        System.out.println("elige");
        int opcion = scanner.nextInt();
        if (opcion == 1){
            this.cuenta1[0] = this.cuenta1[1];
        }
        if (opcion == 2){
            this.cuenta1[1] = this.cuenta1[0];
        }

        if(opcion>2 || opcion<1){
            System.out.println("error accion no valida");
            System.out.println("cuenata1"+cuenta1);
            System.out.println("cuenta2"+cuenta2);
        }

    }
    public void imprimir(Cuenta cuenta1){
        System.out.println("la nueva cuenta 1 es: "+ this.cuenta1[0]);
        System.out.println("la nueva cuenta 2 es: "+ this.cuenta1[1]);
    }

    public Cuenta getCuenta1(int contadorCuenta){
        return this.cuenta1[contadorCuenta];
    }

}
