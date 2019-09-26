package mx.iteso.ut;
/**
 * La tortilla.
 */
public interface Tortilla {
    /**Regresa si la tortilla ya está tostada.
     * @return Regresa true si la tortilla está tostada, false si no lo está.
     */
    boolean isToasted();
    /**Regresa la temperatura en la que se tosta la tortilla.
     * @return Temperatura de tostación.
     */
    int getToastTemperature();
    /**Regresa la temperatura actual de la tortilla.
     * @return Temperatura actual.
    */
    int getCurrentTemperature();
    /**Le da un valor a la temperatura actual.
     * @param temp Temperatura a asignar.
     */
    void setCurrentTemperature(int temp);
    /**Le da un valor a la tortilla para decirle si está tostada o no.
     * @param toasted verdadero o falso.
    */
    void toast(boolean toasted);

}
