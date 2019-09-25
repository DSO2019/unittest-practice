package mx.iteso.ut;
/**
 * Clase.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Variable.
     */
    private boolean tasted;
    /**
     * Variable.
     */
    private int temperature;
    /**
     * Variable.
     */
    private final int toast = 20;
    /**
     * Metodo.
     * @return el valor de toasted.
     */
    public final boolean isToasted() {
        return this.tasted;
    }

    /**
     * Metodo.
     * @return el valor de toasting temp.
     */
    public final int getToastTemperature() {
        return this.toast;
    }

    /**
     * Metodo.
     * @return el valor de temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @param temp is a variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Metodo.
     * @param toasted is a variable.
     */
    public final void toast(final boolean toasted) {
        this.tasted = toasted;

    }
}
