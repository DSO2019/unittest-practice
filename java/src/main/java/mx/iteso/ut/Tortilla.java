package mx.iteso.ut;

/**
 * a tortilla about a class.
 */
public interface Tortilla {

    /**
     * is it toasted?
     * @return nel
     */
    boolean isToasted();

    /**
     * get temperature.
     * @return null
     */
    int getToastTemperature();

    /**
     * get the temperatura.
     * @return null
     */
    int getCurrentTemperature();

    /**
     * set the temperature.
     * @param temp temp
     */
    void setCurrentTemperature(int temp);

    /**
     * toast.
     * @param toasted tasted.
     */
    void toast(boolean toasted);

}
