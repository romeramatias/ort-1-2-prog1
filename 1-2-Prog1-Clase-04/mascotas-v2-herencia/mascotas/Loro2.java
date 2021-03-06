package mascotas;

public class Loro2 extends Mascota2 {

    private int volumen;

    public Loro2(String nombre, int edad, int peso, int volumen) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.volumen = volumen; // Solo los loros tienen volumen (según mi modelo)
    }

    @Override
    public String toString() {
        // Obtengo la representación en String de la superclase Mascota y agrego los atributos de Loro
        return super.toString() + " Con volumen " + this.volumen;
    }

    public void parlotear() {
        // Obtengo su nombre (lo tiene la superclase Mascota) y lo hago parlotear
        System.out.println(super.getNombre() + ": PRRRR PRRRR");
    }
}
