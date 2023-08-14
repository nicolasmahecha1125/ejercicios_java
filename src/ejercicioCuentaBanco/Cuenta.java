package ejercicioCuentaBanco;

public class Cuenta {
    private String titular;
    private double cantidad;

    private long numeroCuenta;

    public Cuenta( double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
        this.numeroCuenta = generarNumeroCuenta();
    }

    private long generarNumeroCuenta() {
        long numero = (long)(Math.random()*1000000000+1);
        return numero;
    }

    private long getNumeroCuenta() {
        return numeroCuenta;
    }

    private String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    private double getCantidad() {
        return cantidad;
    }

    public void ingresarSaldo(double saldo) {
        if(saldo > 0) {
            this.cantidad = this.cantidad + saldo;
        }else{
            System.out.println("ingrese un monto mayor a 0");
        }

    }

    private boolean consultarSaldo(double saldo) {
        if(this.cantidad - saldo < 0) {
            return false;
        } else {
            return true;
        }
    }
}
