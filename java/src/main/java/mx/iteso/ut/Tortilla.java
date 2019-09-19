package mx.iteso.ut;
/** Interfaz para las tortillas. */
public interface Tortilla {
    /** Método para verificar tostado.
     * @return boolean tostado o no.
     */
    boolean isToasted();
    /** Método para verificar temperatura de tostado.
     * @return int temperatura de tostado.
    */
    int getToastTemperature();
    /** Método para verificar temperatura actual.
     * @return int temperatura actual.
    */
    int getCurrentTemperature();
    /** Setter para temperatura de tostado.
     * @param temp Temperatura deseada.
    */
    void setCurrentTemperature(int temp);
    /** Setter para booleano de tostado.
     * @param toasted Tostado o no.
    */
    void toast(boolean toasted);

}
