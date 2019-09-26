package mx.iteso.ut;
/**
 * El queso.
 */
public interface Queso {
    /**Método que checa si el queso está derretido.
     * @return Propiedad melted.
    */
    boolean isMelted();
    /**Método que obtiene la temperatura actual.
     * @return Temperatura actual.
    */
    int getCurrentTemperature();
    /**Método que obtiene la temperatura en la que el queso se derrite.
     * @return Temperatura en la que el queso se derrite.
    */
    int getMeltingTemperature();
    /**Método que obtiene una temperatura nueva y la asigna.
     * @param temp Nueva temperatura.
     */
    void setCurrentTemperature(int temp);
    /**Método que obtiene un booleano, avisando si ya se derritió el queso.
     * @param melted Le dice si está derretido.
     */
    void melt(boolean melted);
}
