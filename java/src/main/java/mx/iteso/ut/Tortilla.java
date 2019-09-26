package mx.iteso.ut;
/** Interfaz tortilla. */
public interface Tortilla {
    /** Verificar si la tortilla está tostada.
    * @return boolean
    */
    boolean isToasted();
    /** Regresa la temperatura actual.
    * @return int temperatura
    */
    int getToastTemperature();
    /** Regresa temperatura a la cual se derrite el queso.
     * @return int temperatura
     */
    int getCurrentTemperature();
    /** Asigna la temperatura actual.
     * @param temp temperatura.
     */
    void setCurrentTemperature(int temp);
     /** Set si está tostado o no.
     * @param toasted o no.
     */
    void toast(boolean toasted);

}
