package mx.iteso.ut;

/** Clase tortilla. */
public interface Tortilla {

    /** Checar estado de la tortilla.
        @return estado.
     */
    boolean isToasted();

    /** Getter toast temperature.
        @return toast temperature.
     */
    int getToastTemperature();

    /** Getter temperature.
        @return temperature.
     */
    int getCurrentTemperature();

    /** Setter temperature.
        @param temp temperature.
     */
    void setCurrentTemperature(int temp);

    /** Setter toasted.
        @param toasted estado.
     */
    void toast(boolean toasted);

}
