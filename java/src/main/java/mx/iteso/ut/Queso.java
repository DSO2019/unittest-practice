package mx.iteso.ut;
/**
 * Clase.
 */
public interface Queso {
    /**
     * Metodo.
     * @return el valor de melted.
     */
     boolean isMelted();
    /**
     * Metodo.
     * @return el valor de current temp.
     */
     int getCurrentTemperature();
    /**
     * Metodo.
     * @return el valor de melting temp.
     */
     int getMeltingTemperature();
    /**
     * Metodo.
     * @param temp is a variable.
     */
     void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param melted is a variable.
     */
     void melt(boolean melted);
}
