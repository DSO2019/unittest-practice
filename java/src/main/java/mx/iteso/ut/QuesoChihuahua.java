package mx.iteso.ut;

/**
 * Clase publica para crear instancias de queso para las quesadillas.
 */
public class QuesoChihuahua implements Queso {
    /**
     * Para evitar magic numbers.
     */
    public static final int MELTING_POINT_NUMBER = 20;
    /**
     * Instancia de derretirse.
     */
    private boolean melted;
    /**
     * Instancia de temperatura para poder derretir el queso.
     */
    private int temperature;
    /**
     * Que temperatura para llegar al punto de derretirse.
     */
    private int melting = MELTING_POINT_NUMBER;

    /**
     * Para checar si el queso se derrite y ver el nivel de la quesadilla.
     * @return Booleano de derretido
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Getter de melted.
     * @return melted
     */
    public boolean getMelted() {
        return melted;
    }

    /**
     * Setter de melted.
     * @param arg melted
     */
    public void settMelted(final boolean arg) {
        this.melted = arg;
    }

    /**
     * Obtener la temperatura para ver si llega a derretirse.
     * @return Temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Funciona de la mano con getCurrentTemperature.
     * @return Que temperatura para deterrir el queso
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Modificar la variable temperatura.
     * @param temp recibe un int para sumarse a otro int
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Checar si se derrite el queso.
     * @param arg Booleano si es que se derritio
     */
    public void melt(final boolean arg) {
        this.melted = arg;
    }
}
