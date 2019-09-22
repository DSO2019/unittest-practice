package mx.iteso.ut;

/**
 * Interfaz para la tortilla y que sea generica.
 */
public interface Tortilla {
    /**
     * Para saber si la variable de tortilla esta tostada.
     * @return un booleano si es tostado
     */
     boolean isToasted();

    /**
     * Para saber la temperatra de la tortilla para comparar vs cuando se tosta.
     * @return Regresa un int de temperatura
     */
     int getToastTemperature();

    /**
     * Obtener la temperatura actual de la tortilla.
     * @return int con temperatura.
     */
     int getCurrentTemperature();

    /**
     * Actualziar el estado de la temperatura de la tortilla.
     * @param temp int + temperatura actual obtenida anteriormente
     */
     void setCurrentTemperature(int temp);

    /**
     * Saber si esta o no tostado el pan.
     * @param toasted booleano de tostado.
     */
     void toast(boolean toasted);

}
