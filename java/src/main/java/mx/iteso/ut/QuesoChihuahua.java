package mx.iteso.ut;

/**
 * A class of quesoChihuahua ajuua.
 */
public class QuesoChihuahua implements Queso {

    /**
     * A magical number.
     */
    private static final int A_MAGIC_NUMBER = 20;

    /**
     * melted? lel,
     */
    private boolean melted;

    /**
     * temperature? lool.
     */
    private int temperature;

    /**
     * melting 20 a magic number jejeje.
     */
    private int melting = A_MAGIC_NUMBER;

    /**
     *  ismelted.
     * @return melted
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * getCurrentTemperature.
     * @return temperatur
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * getMeltingTemperature.
     * @return melting
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * setCurrentTemperature.
     * @param temp temp
     */
    public void setCurrentTemperature(
            final int temp
    ) {
        this.temperature = temp;
    }

    /**
     * melt.
     * @param aMelted melted
     */
    public void melt(
            final boolean aMelted
    ) {
        this.melted = aMelted;

    }
}
