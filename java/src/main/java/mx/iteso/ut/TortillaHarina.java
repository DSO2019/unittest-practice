package mx.iteso.ut;

/**
 * A class by a tortillero.
 */
public class TortillaHarina implements Tortilla {

    /**
     * is it toasted? the people exclaimed.
     * @return false
     */
    public boolean isToasted() {
        return false;
    }

    /**
     * gtt.
     * @return 0
     */
    public int getToastTemperature() {
        return 0;
    }

    /**
     * gct.
     * @return 0
     */
    public int getCurrentTemperature() {
        return 0;
    }

    /**
     * sct.
     * @param temp temp
     */
    public void setCurrentTemperature(
            final int temp
    ) {

    }

    /**
     * t.
     * @param toasted tasted
     */
    public void toast(
            final boolean toasted
    ) {

    }
}
