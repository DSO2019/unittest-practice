package mx.iteso.ut;
/** Interfaz del queso.*/
public interface Queso {
    /**
     * @return esta derretido?.
     */
     boolean isMelted();

    /**
     *
     * @return temperatura actual.
     */
     int getCurrentTemperature();

    /**
     *
     * @return temperatura a la que se derrite queso.
     */
     int getMeltingTemperature();

    /**
     *
     * @param temp temperatura de la quesadilla.
     */
     void setCurrentTemperature(int temp);

    /**
     *
     * @param melted si el queso esta derretido.
     */
     void melt(boolean melted);
}
