package mx.iteso.ut;
/**
 * Interfaz tortilla.
 */
public interface Tortilla {
    /**
     *
     * @return esta tostada?.
     */
     boolean isToasted();

    /**
     *
     * @return tempratura tostada.
     */
     int getToastTemperature();

    /**
     *
     * @return temperatura ahorita.
     */
     int getCurrentTemperature();

    /**
     *
     * @param temp temperatura de ahorita.
     */
     void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted esta tostada.
     */
     void toast(boolean toasted);

}
