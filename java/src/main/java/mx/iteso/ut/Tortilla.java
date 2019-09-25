package mx.iteso.ut;

/**
 * Interface Tortilla.
 */
public interface Tortilla {
    /**
     * Metodo.
     * @return el valor de toasted
     */
     boolean isToasted();
    /**
     * Metodo.
     * @return el valor de toasting temp.
     */
     int getToastTemperature();
    /**
     * Metodo.
     * @return el valor de current temp.
     */
     int getCurrentTemperature();
    /**
     * Metodo.
     * @param temp is a variable that indicates whether or not is toasted.
     */
     void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param toasted is a variable that indicates whether or not is toasted.
     */
     void toast(boolean toasted);

}
