package mx.iteso.ut;
/** Clase TortillaHarina. */
public class TortillaHarina implements Tortilla {
    /** Variable toasted. */
    private boolean toasted;
    /** Variable temperatura. */
    private int temperature;
    /** Variable toasting. */
    private static final int TOASTING = 10;

    /**
        Método que retorna si la tortilla está
        dorada.
        @return boolean toasted.
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
        Método que retorna las temperatura de
        dorado de la tortilla.
        @return int toasting.
     */
    public int getToastTemperature() {
        return TortillaHarina.TOASTING;
    }

    /**
        Método que retorna la temperatura actual de
        la tortilla.
        @return int temperature
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
        Método que establece la temperatura actual de la
        tortilla.
        @param pTemp temperatura
     */
    public void setCurrentTemperature(final int pTemp) {
        this.temperature = pTemp;
    }

    /**
        Método que establece si la tortilla está
        dorada.
        @param pToasted toasted
     */
    public void toast(final boolean pToasted) {
        this.toasted = pToasted;
    }
}
