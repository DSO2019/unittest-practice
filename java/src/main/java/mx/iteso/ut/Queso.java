package mx.iteso.ut;

/**
* Interface for any kind of queso.
*/
public interface Queso {
    /**
    * Returns the current melting status.
    * @return melting status.
    */
    boolean isMelted();

    /**
    * Returns the current temperature.
    * @return current temperature
    */
    int getCurrentTemperature();

    /**
    * Returns the melting temperature.
    * @return melting temperature.
    */
    int getMeltingTemperature();

    /**
    * Sets the current temperature.
    * @param temp temperature selected.
    */
    void setCurrentTemperature(int temp);

    /**
    * Sets queso melting status.
    * @param melted queso status.
    */
    void melt(boolean melted);
}
