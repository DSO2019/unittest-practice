package mx.iteso.ut;

/**
 * clase manchego.
 */
public class QuesoManchego implements Queso {

    /**
     *
     * @return esta derretido?.
     */
    public boolean isMelted() {
        return false;
    }

    /**
     *
     * @return temperatura.
     */
    public int getCurrentTemperature() {
        return 0;
    }

    /**
     *
     * @return temperatura.
     */
    public int getMeltingTemperature() {
        return 0;
    }

    /**
     *
     * @param temp temperatura de la quesadilla.
     */
    public void setCurrentTemperature(final int temp) {

    }

    /**
     *
     * @param melted si el queso esta derretido.
     */
    public void melt(final boolean melted) {

    }
}
