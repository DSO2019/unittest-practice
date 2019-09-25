package mx.iteso.ut;

/**
 * <b>Queso</b>.
 * @see Annotations
 */
public interface Queso {
    /**
     * @return melted.
     */
    boolean isMelted();

    /**
     * @return temperature.
     */
    int getCurrentTemperature();

    /**
     * @return melting.
     */
    int getMeltingTemperature();

    /**
     * @param temp temp.
     */
    void setCurrentTemperature(int temp);

    /**
     * @param melted melted.
     */
    void melt(boolean melted);
}
