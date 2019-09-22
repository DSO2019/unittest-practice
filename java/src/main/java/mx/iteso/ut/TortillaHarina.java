package mx.iteso.ut;

/**
 * Class que impelmenta tortilla y es especifica de Harina.
 */
public class TortillaHarina implements Tortilla {
    /**
     * Para evitar numeros magicos alrededor del archivo.
     */
    public static final int TOAST_POINT_NUMBER = 20;
    /**
     * Variable para ver si se tosto.
     */
    private boolean toast;
    /**
     * Variable para ver la temperatura.
     */
    private int temperature;
    /**
     * Variable para ver en que temepratura se tostara.
     */
    private int toasting = TOAST_POINT_NUMBER;

    /**
     * Para llegar a la variable privada.
     * @return regresa si se tosto o no
     */
    public boolean getToast() {
        return toast;
    }

    /**
     * Actualizar el argumento de toast.
     * @param arg para actualziar toast.
     */
    public void setToast(final boolean arg) {
        this.toast = arg;
    }

    /**
     * Funcion para regresar temperatura actual.
     * @return temperatura
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Funcion para actualizar temperatura.
     * @param arg actualización de temperatura
     */
    public void setTemperature(final int arg) {
        this.temperature = arg;
    }

    /**
     * Obtener cuando va a ser el punto de tostado.
     * @return el numero magico
     */
    public int getToastPointNumber() {
        return this.toasting;
    }

    /**
     * Para checar si se tosto la tortilla.
     * @return si se tosto
     */
    public boolean isToasted() {
        return this.toast;
    }

    /**
     * Para obtener la temperatura a tostar.
     * @return la temperatura para llegar a tostar
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Variable para obtener la temperatura actual.
     * @return Int de temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Actualizar la temperatura acutal.
     * @param temp int + temperatura actual obtenida anteriormente
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Booleano para ver si se toto o no se tosto.
     * @param toasted booleano de tostado.
     */
    public void toast(final boolean toasted) {
        this.toast = toasted;
    }


}
