package mx.iteso.ut;

/** Clase queso chihuahua. */
public class QuesoChihuahua implements Queso {

    /** Estado del queso. */
    private boolean melted;

    /** Temperatura. */
    private int temperature;

    /** Temperatura para derrotar. */
    static final int MELTING = 20;

    /** {@inheritDoc} */
    public final boolean isMelted() {
        return this.melted;
    }

    /** {@inheritDoc} */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /** {@inheritDoc} */
    public final int getMeltingTemperature() {
        return this.MELTING;
    }

    /** {@inheritDoc} */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /** {@inheritDoc} */
    public final void melt(final boolean meltedSet) {
        this.melted = meltedSet;

    }
}
