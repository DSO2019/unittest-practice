package mx.iteso.ut;
/** Clase queso manchego. */
public class QuesoManchego implements Queso {
    /** Variable para melt.*/
    private final boolean melted;
    /** Variable para temperatura.*/
    private final int temperature;
    /** Variable para temperatura de derretido.*/
    private final int melting = 25;
    /** Verificar si el queso está derretido.
     * @return boolean
     */
    public boolean isMelted() {
     return this.melted;
     }
    /** Regresa la temperatura actual.
     * @return int temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
      }
    /** Regresa temperatura a la cual se derrite el queso.
     * @return int temperatura
     */
     public int getMeltingTemperature() {
      return this.melting;
      }
    /** Asigna la temperatura actual.
     * @param temp temperatura.
     */
    public void setCurrentTemperature(final int temp) {
    this.temperature = temp;
    }
     /** Set si está derretido o no.
      * @param melt derretido o no.
      */
    public void melt(final boolean melt) {
        this.melted = melt;
        }
}
