package mx.iteso.ut;
/** Interface Tortilla. */
public interface Tortilla {
    /** Método que retorna si la tortilla está
        tostada.
        @return toasted.
     */
    boolean isToasted();
    /** Método que retorna la temperatura de
        dorado de la tortilla.
        @return int temperatura de tostado.
    */
    int getToastTemperature();
    /** Método que retorna la temperatura actual de
        la tortilla.
        @return int temperatura actual.*/
    int getCurrentTemperature();
    /** Método que establece la temperatura actual.
        @param pTemp temperatura actual*/
    void setCurrentTemperature(int pTemp);
    /** Método que establece si la tostada está
        dorada.
        @param pToasted toasted*/
    void toast(boolean pToasted);
}
