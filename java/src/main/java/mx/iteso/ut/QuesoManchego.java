package mx.iteso.ut;

/**
* The QuesoManchego class has the methods
* and attributes related to QuesoManchego.
* @author  Gustavo Rueda
*/
public class QuesoManchego implements Queso {

    /**Boolean that represents if the cheese if melted.*/
    private boolean melted;
    /**Integer that represents the cheese's temperature.*/
    private int temperature;
    /**Integer that represents the cheese's melting temperature.*/
    private int melting = 20;

    /**
    * Returns a boolean value that
    * represents if the cheese is melted.
    * @return if the cheese is melted or not.
    */
    public boolean isMelted() {
        return this.melted;
    }

    /**
    * Returns the current cheese temperature.
    * @return the cheese's current temperature.
    */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
    * Returns the cheese's melting temperature.
    * @return the cheese's melting temperature.
    */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
    * Sets the cheese's temperature.
    * @param temp the desired temperature.
    */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
    * Sets the cheese's melted boolean value.
    * @param melted the desired boolean value.
    */
    public void melt(final boolean melted) {
        this.melted = melted;
    }
}
