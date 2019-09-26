package mx.iteso.ut;
/**
 * Interfaz de queso.
 */
public interface Queso {
    /**
     * @return si el queso está derretido.
     */
    boolean isMelted();
    /**
     * @return la temperatura actual del queso.
     */
    int getCurrentTemperature();
    /**
     * @return la temperatura a la que se derrite el queso.
     */
    int getMeltingTemperature();
    /**
     * @param temp asigna una temperatura al queso.
     */
    void setCurrentTemperature(int temp);
    /**
     * @param melted derrite el queso.
     */
    void melt(boolean melted);
}
