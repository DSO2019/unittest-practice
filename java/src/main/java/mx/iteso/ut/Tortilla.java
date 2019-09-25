package mx.iteso.ut;

/**
 * <b>Tortilla</b>.
 * @see Annotations
 */
public interface Tortilla {
    /**
     * @return toasted.
     */
    boolean isToasted();

    /**
     * @return toasting.
     */
    int getToastTemperature();

    /**
     * @return temperature.
     */
    int getCurrentTemperature();

    /**
     * @param temp temp.
     */
    void setCurrentTemperature(int temp);

    /**
     * @param toasted toasted.
     */
    void toast(boolean toasted);

}
