package mx.iteso.ut;
/**
 * clase tortilla mazi.
 */
public class TortillaMaiz implements Tortilla {
    /**
     *
     * @return esta tostada?.
     */
    public boolean isToasted() {
        return false;
    }

    /**
     *
     * @return temperatura tostada.
     */
    public int getToastTemperature() {
        return 0;
    }

    /**
     *
     * @return temperatura ahorita.
     */
    public int getCurrentTemperature() {
        return 0;
    }

    /**
     *
     * @param temp temperatura de ahorita.
     */
    public void setCurrentTemperature(final int temp) {

    }

    /**
     *
     * @param toasted esta tostada.
     */
    public void toast(final boolean toasted) {

    }
}
