package mx.iteso.ut;
/** Interfaz tortilla Harina. */
public class TortillaHarina implements Tortilla {
    /** Variable para toast.*/
    private final boolean toasted;
    /** Variable para temperatura.*/
    private final int temperature;
    /** Variable para temperatura de tostado.*/
    private final int toasting = 40;

    /** Verificar si la tortilla está tostada.
     * @return boolean
     */
    public boolean isToasted() {
    return this.toasted;
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
     public int getToastTemperature() {
       return this.toasting;
      }
/** Asigna la temperatura actual.
* @param temp temperatura.
*/
public void setCurrentTemperature(final int temp) {
this.temperature = temp;
}
/** Set si está tostado o no.
* @param toast o no.
*/
 public void toast(final boolean toast) {
this.toasted = toast;
}
}
