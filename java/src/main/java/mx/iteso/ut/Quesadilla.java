/**
 * paquetes.
 */
package mx.iteso.ut;

/**
 * Bienvenido al mundo de las quesadillas.
 */
public class Quesadilla {
    /**Declarando queso.*/
    private Queso queso;

    /**Declarando tortilla.*/
    private Tortilla tortilla;

    /**Declarando tortilla1.*/
    private Tortilla tortilla1;

    /**Declarando tortilla2.*/
    private Tortilla tortilla2;

    /**Declarando calentación.*/
    private int heatLevel;

    /**
     *
     * @return quesarilla simple.
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {

         getTortilla()
                 .setCurrentTemperature(
                         getTortilla().getCurrentTemperature()
                                 + getHeatLevel()
                 );

         getQueso().setCurrentTemperature(
                 getQueso().getCurrentTemperature()
                         + getHeatLevel()
         );

         if (getTortilla().getCurrentTemperature()
                 >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }

         if (getQueso().getCurrentTemperature()
                 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
     }

     if (getQueso().isMelted()
             && getTortilla().isToasted()) {
         return "Perfect quesadilla";
     }

     if (getQueso().isMelted()
             && !getTortilla().isToasted()) {
         return "Good quesadilla";
     }

     if (!getQueso().isMelted()
             && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }
    }

    /**@return Preparar quesadilla double.*/
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla1().setCurrentTemperature(
                    getTortilla1().getCurrentTemperature()
                            + getHeatLevel());

            getTortilla2().setCurrentTemperature(
                    getTortilla2().getCurrentTemperature()
                            + getHeatLevel());

            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature()
                            + getHeatLevel());

            if (getTortilla1().getCurrentTemperature()
                    >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }

            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted()
                && getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }

        if (getQueso().isMelted()
                && ((getTortilla1().isToasted()
                && !getTortilla2().isToasted())
                || (!getTortilla1().isToasted()
                && getTortilla2().isToasted()))) {
            return "Good quesadilla";
        }

        if (getQueso().isMelted()
                && !getTortilla1().isToasted()
                && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }

        if (!getQueso().isMelted()
                && getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Quesadilla mala";
        }



        if (!getQueso().isMelted()
                && ((getTortilla1().isToasted()
                && !getTortilla2().isToasted())
                || (!getTortilla1().isToasted()
                && getTortilla2().isToasted()))) {
            return "Quesadilla terrible";
        } else {
            return "No se cocino";
        }
    }

    /**@return queso utilizado.*/
    public Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param aqueso que se usara.
     */
    public void setQueso(final Queso aqueso) {
        this.queso = aqueso;
    }

    /**
     *
     * @return tortilla.
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @param atortilla .
     */
    public void setTortilla(final Tortilla atortilla) {
        this.tortilla = atortilla;
    }

    /**
     *
     * @return nivel de calentamiento.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param aheatLevel nivel calentamiento.
     */
    public void setHeatLevel(final int aheatLevel) {
        this.heatLevel = aheatLevel;
    }

    //-----------------------Double quesadilla ---------------------

    /**
     *
     * @return tortilla1.
     */
    public Tortilla getTortilla1() {
        return tortilla1;
    }

    /**
     *
     * @param atortilla1 .
     */
    public void setTortilla1(final Tortilla atortilla1) {
        this.tortilla1 = atortilla1;
    }

    /**
     *
     * @return tortilla2.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     *
     * @param atortilla2 tortilla2.
     */
    public void setTortilla2(final Tortilla atortilla2) {
        this.tortilla2 = atortilla2;
    }


}
