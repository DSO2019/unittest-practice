package mx.iteso.ut;
/**Interfaz queso.*/
public interface Queso {
    /**@return si el queso esta derretido.*/
    boolean isMelted();

    /**@return la temperatura actual del queso.*/
    int getCurrentTemperature();

    /**@return la temperatura en que se derrite el queso.*/
    int getMeltingTemperature();

    /**@param temp temperatura actual.*/
    void setCurrentTemperature(int temp);

    /**@param melted si el queso esta derretido.*/
    void melt(boolean melted);
}
