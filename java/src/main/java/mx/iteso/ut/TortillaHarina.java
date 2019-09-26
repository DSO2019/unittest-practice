package mx.iteso.ut;

/**
 * Clase de Tortilla de Harina.
 */
public class TortillaHarina implements Tortilla {
    /**
     * Número mágico
     * Temperatura de tostado de la tortilla.
     */
    public static final int TOASTTEMP = 10;
    /**
     * Booleano que dice si la tortilla está tostada o no.
     */
    private boolean toasted;
    /**
     * Temperatura actual de la quesadilla.
     */
    private int temperature;
    /**
     * Nivel a la que se tosta la tortilla.
     */
    private int toasting = TOASTTEMP;

    /**
     * @return Retorna el estado tostado o no de la tortilla.
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     * @return Retorna la temperatura a la que se tosta la tortilla.
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * @return Regresa la temperatura actual de la tortilla.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @param temp asigna una temperatura a la tortilla.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param toast tosta la tortilla.
     */
    public void toast(final boolean toast) {
        this.toasted = toast;
    }
}
