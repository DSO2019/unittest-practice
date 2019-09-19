package mx.iteso.ut;
/** Clase del queso chihuahua. */
public class QuesoChihuahua implements Queso {
    /** Si está derretido o no. */
    private boolean melted;
    /** Temperatura actual. */
    private int temperature;
    /** Temperatura de derretido. */
    private static final int MELTING = 20;

    /** Getter de derretido.
     * @return boolean Si está derretido o no.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /** Getter de temperatura actual.
     * @return int Temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /** Getter de temperatura de derretido.
     * @return int Temperatura de derretido.
     */
    public int getMeltingTemperature() {
        return QuesoChihuahua.MELTING;
    }

    /** Setter de temperatura actual.
     *  @param temp Temperatura.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /** Setter de derretido.
     * @param meltedBool Si está o no derretido.
     */
    public void melt(final boolean meltedBool) {
        this.melted = meltedBool;
    }
}
