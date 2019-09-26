package mx.iteso.ut;
/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**Variable que guarda el queso. */
    private Queso queso;
    /**Variable que guarda la tortilla. */
    private Tortilla tortilla;
    /**Variable que guarda la segunda tortilla en caso
     * de preparar quesadilla doble. */
    private Tortilla tortilla2;
    /**Variable que guarda el heatlevel. */
    private int heatLevel;

    /**Preparacion de quesadilla normal.
     * @return Regresa si se preparó o no.
    */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
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

        if (getQueso().isMelted() && getTortilla().isToasted()) {
            return "Perfect quesadilla";
        } else if (getQueso().isMelted() && !getTortilla().isToasted()) {
            return "Good quesadilla";
        } else if (!getQueso().isMelted() && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**Preparacion de quesadilla doble.
     * @return Regresa si se preparó o no.
    */
    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel()
            );
            getTortilla2().setCurrentTemperature(
                getTortilla2().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
            );
            if (getTortilla().getCurrentTemperature()
                >= getTortilla().getToastTemperature()) {
                    getTortilla().toast(true);
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

        if (getQueso().isMelted() && getTortilla().isToasted()
            && getTortilla2().isToasted()) {
                return "Perfect quesadilla";
            } else if ((getQueso().isMelted() && !getTortilla().isToasted()
            && getTortilla2().isToasted())
            || (getQueso().isMelted() && getTortilla().isToasted()
            && !getTortilla2().isToasted())) {
                return "Good quesadilla";
            } else if (!getQueso().isMelted() && getTortilla().isToasted()
            && getTortilla2().isToasted()) {
                return "Bad quesadilla";
            } else if (getQueso().isMelted() && !getTortilla().isToasted()
            && !getTortilla2().isToasted()) {
                return "Regular quesadilla";
            } else if ((!getQueso().isMelted() && !getTortilla().isToasted()
            && getTortilla2().isToasted())
            || (!getQueso().isMelted() && getTortilla().isToasted()
            && !getTortilla2().isToasted())) {
                return "Terrible quesadilla";
            } else {
                return "You ran out of gas";
            }
    }

    /**Regresa el queso.
     * @return El queso.
    */
    public Queso getQueso() {
        return queso;
    }

    /**Le da un valor al queso.
     * @param newQueso El queso.
    */
    public void setQueso(final Queso newQueso) {
        this.queso = newQueso;
    }

    /**Regresa la tortilla.
     * @return La tortilla.
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**Le da un valor a la tortilla.
     * @param newTortilla La tortilla.
    */
    public void setTortilla(final Tortilla newTortilla) {
        this.tortilla = newTortilla;
    }

    /**Regresa la segunda tortilla.
     * @return Segunda tortilla.
    */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**Le da un valor a la segunda tortilla.
     * @param newTortilla Segunda tortilla.
    */
    public void setTortilla2(final Tortilla newTortilla) {
        this.tortilla2 = newTortilla;
    }

    /**Regresa el valor de heatLevel.
     * @return Heat level.
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**Le da un valor al heatLevel.
     * @param newHeatLevel Heat level.
    */
    public void setHeatLevel(final int newHeatLevel) {
        this.heatLevel = newHeatLevel;
    }
}
