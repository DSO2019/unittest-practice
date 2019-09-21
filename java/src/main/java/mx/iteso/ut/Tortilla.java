package mx.iteso.ut;

/**
 * Interfaz para la creación de distintas tortillas para la clase quesadilla.
 */
public interface Tortilla {
    /**
     *
      * @return el tueste de la tortilla
     */
    boolean isToasted();

    /**
     *
     * @return la temperatura a la que se tuesta la tortilla.
     */
    int getToastTemperature();

    /**
     *
     * @return la temperatura actual de la tortilla
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp define la temperatura actual de la tortilla.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted evalua el tueste de la tortilla.
     */
    void toast(boolean toasted);
}
