package mx.iteso.ut;

/**
 * Interfaz de una tortilla.
 */
public interface Tortilla {
    /**
     * @return si la tortilla está tostada.
     */
    boolean isToasted();
    /**
     * @return la temperatura a la que se tosta la tortilla.
     */
    int getToastTemperature();
    /**
     * @return la temperatura actual de la tortilla.
     */
    int getCurrentTemperature();
    /**
     * @param temp asigna una temperatura a la tortilla.
     */
    void setCurrentTemperature(int temp);
    /**
     * @param toasted tosta una tortilla.
     */
    void toast(boolean toasted);

}
