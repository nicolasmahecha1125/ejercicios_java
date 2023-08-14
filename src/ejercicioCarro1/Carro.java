package ejercicioCarro1;

public class Carro {
    private  Motor motor;
    private Llanta[] Llantas;
    private int contadorLlantas = 0;
    public Carro(Motor motor){
        this.motor = motor;
        this.Llantas = new Llanta[4];
    }
    public void agregarLlanta(Llanta Llanta){
        this.Llantas[contadorLlantas] = Llanta;
        this.contadorLlantas++;
    }
    public Motor getMotor(){

        return this.motor;
    }

    public Llanta obtenerLlanta(int numeroLlanta){

        return this.Llantas[numeroLlanta];
    }

}
