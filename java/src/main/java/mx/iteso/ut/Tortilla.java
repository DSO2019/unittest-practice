package mx.iteso.ut;

/**
* The Tortilla interface has 5 methods related
* all tortilla operations.
* @author  Gustavo Rueda
*/
public interface Tortilla {
    /**
    * Returns a boolean value that
    * represents if the tortilla is toasted.
    * @return if the tortilla is toasted or not.
    */
    boolean isToasted();

    /**
    * Returns the tortilla's toasting temperature.
    * @return the tortilla's toasting temperature.
    */
    int getToastTemperature();

    /**
    * Returns the current tortilla temperature.
    * @return the tortilla's current temperature..
    */
    int getCurrentTemperature();

    /**
    * Sets the tortilla's temperature.
    * @param temp the desired temperature.
    */
    void setCurrentTemperature(int temp);

    /**
    * Sets the tortilla's toasted boolean value.
    * @param toasted the desired boolean value.
    */
    void toast(boolean toasted);
}
