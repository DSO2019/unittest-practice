package mx.iteso.ut;
/** Clase de la tortilla de harina. */
public class TortillaMaiz implements Tortilla {
    /** Si está tostada o no. */
    private boolean toasted;
    /** Temperatura actual. */
    private int temperature;
    /** Temperatura de tostado. */
    private static final int TOASTING = 10;

    /** Getter de tostado.
     * @return boolean Si está tostado o no.
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /** Getter de temperatura actual.
     * @return int Temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /** Getter de temperatura de tostado.
     * @return int Temperatura de tostado.
     */
    public int getToastTemperature() {
        return TortillaMaiz.TOASTING;
    }

    /** Setter de temperatura actual.
     *  @param temp Temperatura.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /** Setter de tostado.
     * @param toastedBool Si está o no tostado.
     */
    public void toast(final boolean toastedBool) {
        this.toasted = toastedBool;
    }
}
