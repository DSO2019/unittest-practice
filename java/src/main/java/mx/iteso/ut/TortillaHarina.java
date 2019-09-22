package mx.iteso.ut;

/**
* The TortillaHarina class has 5 methods
* and the attributes related to all
* TortillaHarina operations.
* @author  Gustavo Rueda
*/
public class TortillaHarina implements Tortilla {

    /**Boolean that represents if the tortilla if toasted.*/
    private boolean toast;
    /**Integer that represents the tortilla's temperature.*/
    private int temperature;
    /**Integer that represents the tortilla's toasting temperature.*/
    private int toasting = 20;

    /**
    * Returns a boolean value that
    * represents if the tortilla is toasted.
    * @return if the tortilla is toasted or not.
    */
    public boolean isToasted() {
        return this.toast;
    }

    /**
    * Returns the tortilla's toasting temperature.
    * @return the tortilla's toasting temperature.
    */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
    * Returns the current tortilla temperature.
    * @return the tortilla's current temperature..
    */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
    * Sets the tortilla's temperature.
    * @param temp the desired temperature.
    */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
    * Sets the tortilla's toasted boolean value.
    * @param toasted the desired boolean value.
    */
    public void toast(final boolean toasted) {
        this.toast = toasted;
    }
}
