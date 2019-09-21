package mx.iteso.ut;

/**
 * Interfaz para la creación de distintos quesos para la clase quesadilla.
 */
public interface Queso {
    /**
     *
     * @return el estado del queso
     */
    boolean isMelted();

    /**
     *
     * @return la temperatura actual del queso.
     */
    int getCurrentTemperature();

    /**
     *
     * @return la temperatura a la cual se derrite el queso.
     */
    int getMeltingTemperature();

    /**
     *
     * @param temp define la temperatura actual del queso.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param melt evalua el estado del queso.
     */
    void melt(boolean melt);
}
