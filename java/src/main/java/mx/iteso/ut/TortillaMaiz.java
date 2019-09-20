package mx.iteso.ut;

/** Clase tortilla maiz. */
public class TortillaMaiz implements Tortilla {

    /** Estado de la tortilla. */
    private boolean toasted;

    /** Temperatura de la tortilla. */
    private int temperature;

    /** Temperatura a tostar. */
    static final int TOASTING = 20;

    /** {@inheritDoc} */
    public final boolean isToasted() {
        return toasted;
    }

    /** {@inheritDoc} */
    public final int getToastTemperature() {
        return this.TOASTING;
    }

    /** {@inheritDoc} */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /** {@inheritDoc} */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /** {@inheritDoc} */
    public final void toast(final boolean toastedSet) {
        this.toasted = toastedSet;
    }
}
