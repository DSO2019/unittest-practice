package mx.iteso.ut;

/**
 * Queso class .-.
 */
public interface Queso {
    /**
     * Check if melted.
     * @return norhing
     */
    boolean isMelted();

    /**
     * Get current termperature.
     * @return nothing
     */
    int getCurrentTemperature();

    /**
     * getMeltingTemperatur.
     * @return nothing
     */
    int getMeltingTemperature();

    /**
     * SetCurrentTemp.
     * @param temp temp
     */
    void setCurrentTemperature(
            int temp
    );

    /**
     * melt.
     * @param melted melted
     */
    void melt(boolean melted);
}
