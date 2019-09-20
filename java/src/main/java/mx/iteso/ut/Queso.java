package mx.iteso.ut;

/**
* This is a Javadoc comment.
*/
public interface Queso {
    /**
    * This is a Javadoc comment.
    * @return is melted.
    */
    boolean isMelted();

    /**
    * This is a Javadoc comment.
    * @return current temperature.
    */
    int getCurrentTemperature();

    /**
    * This is a Javadoc comment.
    * @return melting temperature.
    */
    int getMeltingTemperature();

    /**
    * This is a Javadoc comment.
    * @param temp temp.
    */
    void setCurrentTemperature(int temp);

    /**
    * This is a Javadoc comment.
    * @param melted melted.
    */
    void melt(boolean melted);
}
