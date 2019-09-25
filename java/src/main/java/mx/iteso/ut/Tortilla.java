package mx.iteso.ut;
/**Interfaz Tortilla.*/
public interface Tortilla {
    /**@return si la tortilla esta tostada.*/
    boolean isToasted();

    /**@return la temperatura a la que se tosta la tortilla.*/
    int getToastTemperature();

    /**@return la temperatura actual de la tortilla.*/
    int getCurrentTemperature();

    /**@param temp temperatuca actual.*/
    void setCurrentTemperature(int temp);

    /**@param toasted si la tortilla esta tostada.*/
    void toast(boolean toasted);
}
