package mx.iteso.ut;
/** Interface Queso. */
public interface Queso {
    /** Método para saber si el queso
        está derretido.
        @return Boolean si el queso está derretido.*/
    boolean isMelted();
    /** Método para obtener la temperatura
        actual del queso.
        @return int Temperatura actual.*/
    int getCurrentTemperature();
    /** Método para obtener la temperatura
        de fusión del queso.
        @return int Teperatura de fusión.*/
    int getMeltingTemperature();
    /** Método para establecer la temperatura
        actual del queso.
        @param temp Temperatura a establecer.*/
    void setCurrentTemperature(int temp);
    /** Método melt.
        @param melted Está derretido*/
    void melt(boolean melted);
}
