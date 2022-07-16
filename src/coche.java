public class coche {   //Crear una clase coche.
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public int puertas = 3; //una variable numérica que almacene el número de puertas que tiene.
    public void sumarPuertas(){//Una función que incremente el número de puertas que tiene el coche.
        this.puertas++;
    }


}
 /* Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/