package mx.iteso.ut;

/**
 * This is a Javadoc comment.
 */
public interface Tortilla {
    /**
     * This is a Javadoc comment.
     * @return is toasted.
     */
    boolean isToasted();

    /**
     * This is a Javadoc comment.
     * @return toast temperature.
     */
    int getToastTemperature();

    /**
     * This is a Javadoc comment.
     * @return current temperature.
     */
    int getCurrentTemperature();

    /**
     * This is a Javadoc comment.
     * @param temp temp.
     */
    void setCurrentTemperature(int temp);

    /**
     * This is a Javadoc comment.
     * @param toasted toasted.
     */
    void toast(boolean toasted);
}
