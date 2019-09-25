package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {

    /**Queso.*/
    private Queso queso;

    /**Tortilla uno.*/
    private Tortilla tortilla1;

    /**Tortilla dos para la quesadilla doble.*/
    private Tortilla tortilla2;

    /**Temperatura del comal.*/
    private int heatLevel;

    /**@return la calidad de una quesadilla sencilla.*/
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()) {
            getTortilla1().setCurrentTemperature(
                    getTortilla1().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature() + getHeatLevel()
            );
            if (getTortilla1().getCurrentTemperature()
                    >=
                    getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >=
                    getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted() && getTortilla1().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla1().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla1().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**@return la calidad de una quesadilla doble.*/
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla1().setCurrentTemperature(
                    getTortilla1().getCurrentTemperature() + getHeatLevel()
            );
            getTortilla2().setCurrentTemperature(
                    getTortilla2().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature() + getHeatLevel()
            );
            if (getTortilla1().getCurrentTemperature()
                    >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
        }
        if (getQueso().isMelted() && getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && getTortilla1().isToasted()
                && !getTortilla2().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        }
        if (!getQueso().isMelted() && !getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla1().isToasted()
                && !getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        }
        if (!getQueso().isMelted() && !getTortilla1().isToasted()
                && !getTortilla2().isToasted()) {
            return "You ran out of gas";
        } else {
            return "Regular quesadilla";
        }
    }

    /**@return el queso que se va a usar.*/
    public Queso getQueso() {
        return queso;
    }

    /**@param pQueso a poner en la quesadilla.*/
    public void setQueso(final Queso pQueso) {
        this.queso = pQueso;
    }

    /**@return la tortilla que se va a usar.*/
    public Tortilla getTortilla1() {
        return tortilla1;
    }

    /**@return la segunda tortilla que se va a usar.*/
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**@param pTortilla1 primera tortilla de la quesadilla.
     * @param pTortilla2 segunda tortilla de la quesadilla.*/
    public void setTortilla(
            final Tortilla pTortilla1, final Tortilla pTortilla2
    ) {
        this.tortilla1 = pTortilla1;
        this.tortilla2 = pTortilla2;
    }

    /**@return temperatura del comal.*/
    public int getHeatLevel() {
        return heatLevel;
    }

    /**@param pHeatLevel temperatura que se va a usar en el comal */
    public void setHeatLevel(final int pHeatLevel) {
        this.heatLevel = pHeatLevel;
    }
}
