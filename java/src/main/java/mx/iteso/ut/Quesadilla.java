package mx.iteso.ut;

/**
* The Quesadilla class has the methods
* and attributes related to Quesadilla.
* @author  Gustavo Rueda
*/
final public class Quesadilla {

    /** Cheese that the quesadilla will use.*/
    private Queso queso;
    /** Tortilla that a single or double quesadilla can use.*/
    private Tortilla tortilla;
    /** Tortilla that a double quesadilla can use.*/
    private Tortilla tortilla2;
    /** Quesadillaś heat level.*/
    private int heatLevel;

    /**
    * This method prepares a single quesadilla.
    * @return The quesadilla message status.
    */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted() && getTortilla().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }

    /**
    * This method prepares a double quesadilla.
    * @return The quesadilla message status.
    */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature() < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if ((getQueso().isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted())
                || (getQueso().isMelted() && getTortilla().isToasted() && !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        }
        if ((!getQueso().isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted())
                || (!getQueso().isMelted() && getTortilla().isToasted() && !getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(final Queso queso) {
        this.queso = queso;
    }

    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(final Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public Tortilla getTortilla2() {
        return tortilla2;
    }

    public void setTortilla2(final Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(final int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
