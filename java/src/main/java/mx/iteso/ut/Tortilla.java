package mx.iteso.ut;

/**
* Interface for any kind of queso.
*/
public interface Tortilla {
    /**
    * Returns the current toasting status.
    * @return toasting status.
    */
    boolean isToasted();

    /**
    * Returns the toasting temperature.
    * @return toasting temperature.
    */
    int getToastTemperature();
    /**
    * Returns the current temperature.
    * @return current temperature
    */
    int getCurrentTemperature();
    /**
    * Sets the current temperature.
    * @param temp temperature selected.
    */
    void setCurrentTemperature(int temp);

    /**
    * Sets tortilla toasting status.
    * @param toasted tortilla status.
    */
    void toast(boolean toasted);

}
