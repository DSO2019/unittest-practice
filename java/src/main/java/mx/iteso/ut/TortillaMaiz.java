package mx.iteso.ut;

/**
 * Clase Que implementa la interfaz tortilla.
 * Se utilizará para mockear las tortillas en los metodos de preparacion.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Evitar numeros magicos.
     * Define la temperatura a la cual se tuesta la tortilla.
     */
    public static final int TOASTEMP = 10;

    /**
     * Evalúa el estado de tueste de la tortilla.
     */
    private boolean toasted;
    /**
     * Controla la temperatura de la tortilla.
     */
    private int temperature;
    /**
     * Define la temperatura a la cual se tuesta la tortilla.
     */
    private int toasting = TOASTEMP;

    /**
     *
     * @return el estado de la tortilla.
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     *
     * @return la temperatura a la cual se tuesta la tortilla.
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     *
     * @return temperatura actual de la tortilla.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @param temp define la temperatura actual de la tortilla.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param toast evalua el tueste de la tortilla.
     */
    public void toast(final boolean toast) {
        this.toasted = toast;
    }
}
