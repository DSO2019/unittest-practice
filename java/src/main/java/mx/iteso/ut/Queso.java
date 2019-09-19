package mx.iteso.ut;
/** Interfaz para los quesos. */
public interface Queso {
    /** Método para verificar derretido.
     * @return boolean derretido o no.
     */
    boolean isMelted();
    /** Método para verificar temperatura de derretido.
     * @return int temperatura de derretido.
    */
    int getMeltingTemperature();
    /** Método para verificar temperatura actual.
     * @return int temperatura actual.
    */
    int getCurrentTemperature();
    /** Setter para temperatura de derretido.
     * @param temp Temperatura deseada.
    */
    void setCurrentTemperature(int temp);
    /** Setter para booleano de derretido.
     * @param melted Tostado o no.
    */
    void melt(boolean melted);

}
