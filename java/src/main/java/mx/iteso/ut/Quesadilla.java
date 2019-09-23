package mx.iteso.ut;

/**
* The Quesadilla class has the methods
* and attributes related to Quesadilla.
* @author  Gustavo Rueda
*/
public final class Quesadilla {

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

    /**
    * Gets the cheese.
    * @return The cheese.
    */
    public Queso getQueso() {
        return queso;
    }

    /**
    * Sets the cheese.
    * @param c The cheese.
    */
    public void setQueso(final Queso c) {
        this.queso = c;
    }

    /**
    * Gets the first tortilla.
    * @return The first tortilla.
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
    * Sets the first tortilla.
    * @param t The first tortilla.
    */
    public void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
    * Gets the second tortilla.
    * @return The second tortilla.
    */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
    * Sets the second tortilla.
    * @param t The second tortilla.
    */
    public void setTortilla2(final Tortilla t) {
        this.tortilla2 = t;
    }

    /**
    * Gets the heat level.
    * @return The heat level.
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
    * Sets the heat level.
    * @param h The heat level.
    */
    public void setHeatLevel(final int h) {
        this.heatLevel = h;
    }
}
