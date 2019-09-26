package mx.iteso.ut;
/**
 * Queso Manchego, implementa la interfaz Queso.
 */
public class QuesoManchego implements Queso {

    /**Variable que guarda si el queso chihuahua está derretido. */
    private boolean melted;
    /**Variable que guarda la temperatura del queso. */
    private int temperature;
    /**Variable que guarda a que temperatura se derrite el queso chihuahua. */
    private static final int MELTING = 20;

    /**Regresa la variable melted.
     * @return True si el queso está derretido, false si no lo está.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**Regresa la variable temperature.
     * @return Regresa la temperatura actual del queso.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**Regresa la variable melting.
     * @return Regresa la temperatura en la que se derrite el queso.
     */
    public int getMeltingTemperature() {
        return QuesoManchego.MELTING;
    }
    /**Le asigna una temperatura al queso.
     * @param temp La temperatura a asignar.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**Le cambia el valor a la variable melted.
     * @param melted2 true si el queso estará derretido, false de no ser así.
     */
    public void melt(final boolean melted2) {
        this.melted = melted;

    }
}
