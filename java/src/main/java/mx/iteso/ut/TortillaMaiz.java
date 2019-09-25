package mx.iteso.ut;

/**Clase Tortilla Maiz implementa la interfaz Tortilla.*/
public class TortillaMaiz implements Tortilla {
    /**Determina si la tortilla esta tostada.*/
    private boolean toasted;

    /**Temperatura actual de la tortilla.*/
    private int temperature;

    /**Temperatura a la que se tosta la tortilla.*/
    private final int toast = 17;

    /**@return si la tortilla esta tostada.*/
    public boolean isToasted() {
        return this.toasted;
    }

    /**@return la temperatura a la que se tosta la tortilla.*/
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**@return la temperatura actual de la tortilla.*/
    public int getToastTemperature() {
        return this.toast;
    }

    /**@param temp temperatuca actual.*/
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**@param pToasted si la tortilla esta tostada.*/
    public void toast(final boolean pToasted) {
        this.toasted = pToasted;
    }
}
