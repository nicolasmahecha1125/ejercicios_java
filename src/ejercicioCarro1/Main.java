package ejercicioCarro1;

public class Main {
    public static void main(String[] args){
        //crear motor
        Motor motorCarro = new Motor("china", "china23");
        //crear llantas
        Llanta Llanta1 = new Llanta("maracaRin", "1");
        Llanta Llanta2 = new Llanta("maracaRin", "2");
        Llanta Llanta3 = new Llanta("maracaRin", "3");
        Llanta Llanta4 = new Llanta("maracaRin", "4");
        //crear llata
        Carro carroMazda = new Carro(motorCarro);
        //asignar llantas
        carroMazda.agregarLlanta(Llanta1);
        carroMazda.agregarLlanta(Llanta2);
        carroMazda.agregarLlanta(Llanta3);
        carroMazda.agregarLlanta(Llanta4);

        //obtener las relaciones de la clace principal que es carro
        Motor motor = carroMazda.getMotor();
        Llanta llanta = carroMazda.obtenerLlanta(2);


    }


}
