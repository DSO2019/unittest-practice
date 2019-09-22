package mx.iteso.ut;

/**
 * Interfaz de queso para hacer quesadillas.
 */
public interface Queso {
    /**
     * Checar si ya se derritio.
     * @return booleanos
     */
    boolean isMelted();

    /**
     * Obtenemos la temperatura actual.
     * @return Int para sumarse con temperatura
     */
    int getCurrentTemperature();

    /**
     * Obtiene la temperatura a la cual se derrite el queso.
     * @return Int de temperatura
     */
    int getMeltingTemperature();

    /**
     * Para actualizar la temperatura.
     * @param temp recibe un int para sumarse a otro int
     */
    void setCurrentTemperature(int temp);

    /**
     * Checa si se derritio el queso.
     * @param melted Booleano si es que se derritio
     */
    void melt(boolean melted);
}
