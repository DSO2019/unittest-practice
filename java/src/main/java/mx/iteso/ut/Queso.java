package mx.iteso.ut;
/** Interfaz queso. */
public interface Queso {
    /** Verificar si el queso está derretido.
     * @return boolean
     */
     boolean isMelted();
     /** Regresa la temperatura actual.
      * @return int temperatura
      */
     int getCurrentTemperature();
     /** Regresa temperatura a la cual se derrite el queso.
      * @return int temperatura
      */
     int getMeltingTemperature();
     /** Asigna la temperatura actual.
      * @param temp temperatura.
      */
     void setCurrentTemperature(int temp);
     /** Set si está derretido o no.
      * @param melted derretido o no.
      */
     void melt(boolean melted);
}
