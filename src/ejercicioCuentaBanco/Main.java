package ejercicioCuentaBanco;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("nicolas");
        //crear cuenta
        Cuenta cuenta1 = new Cuenta(3000);
        Cuenta cuenta2 = new Cuenta(1000);
        // crear banco
        Banco banco = new Banco(persona1);
        // asignar cuentas
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        banco.transferencia(cuenta1,cuenta2);


        banco.imprimir(cuenta1);

        Cuenta cuenta_1 = banco.getCuenta1(1);




    }
}
