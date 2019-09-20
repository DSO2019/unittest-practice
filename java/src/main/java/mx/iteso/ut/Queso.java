package mx.iteso.ut;

/** Interfaz Queso. */
public interface Queso {

    /** Checar estado del queso.
        @return estado del queso.
     */
    boolean isMelted();

    /** Getter temperature.
        @return temperature.
     */
    int getCurrentTemperature();

    /** Getter melting temperature.
        @return melting temperature.
     */
    int getMeltingTemperature();

    /** Setter queso.
        @param temp temperatura.
     */
    void setCurrentTemperature(int temp);

    /** Derretir queso.
        @param melted estado del queso.
     */
    void melt(boolean melted);
}
