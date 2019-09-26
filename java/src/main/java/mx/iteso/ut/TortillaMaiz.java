package mx.iteso.ut;
/**
 * Tortilla de maiz, implementa la interfaz Tortilla.
 */
public class TortillaMaiz implements Tortilla {
    /**Variable que guarda si la tortilla ya está tostada. */
    private boolean isToasted;
    /**Variable que guarda la temperatura actual de la tortilla. */
    private int temperature;
    /**Variable que guarda la temperatura en la que se tosta la tortilla. */
    private static final int TOASTING = 10;
    /** Regresa la variable isToasted.
     * @return Si la tortilla ya está tostada o no.
     */
    public boolean isToasted() {
        return this.isToasted;
    }
    /** Regresa la variable TOASTING.
     * @return la temperatura en la que la tortilla se puede tostar.
     */
    public int getToastTemperature() {
        return TortillaMaiz.TOASTING;
    }
    /** Regresa la variable temperature.
     * @return la temperatura actual de la tortilla.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**Le asigna una temperatura a la tortilla.
     * @param temp La temperatura a asignar.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**Le cambia el valor a la variable isToasted.
     * @param toasted true si la tortilla estará tostada, false de no ser así.
     */
    public void toast(final boolean toasted) {
        this.isToasted = toasted;
    }
}
