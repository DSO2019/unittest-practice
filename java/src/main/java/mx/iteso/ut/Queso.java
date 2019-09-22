package mx.iteso.ut;

/**
* The Queso interface has 5 methods related
* all cheese operations.
* @author  Gustavo Rueda
*/
public interface Queso {
    /**
    * Returns a boolean value that
    * represents if the cheese is melted.
    * @return if the cheese is melted or not.
    */
    boolean isMelted();

    /**
    * Returns the current cheese temperature.
    * @return the cheese's current temperature.
    */
    int getCurrentTemperature();

    /**
    * Returns the cheese's melting temperature.
    * @return the cheese's melting temperature.
    */
    int getMeltingTemperature();

    /**
    * Sets the cheese's temperature.
    * @param temp the desired temperature.
    */
    void setCurrentTemperature(int temp);

    /**
    * Sets the cheese's melted boolean value.
    * @param melted the desired boolean value.
    */
    void melt(boolean melted);
}
