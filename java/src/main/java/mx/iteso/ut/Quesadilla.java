package mx.iteso.ut;

/**
 * <b>Quesadilla</b>.
 * @see Annotations
 */
public class Quesadilla {
    /**
     * queso.
     */
    private Queso queso;
    /**
     * tortilla.
     */
    private Tortilla tortilla;
    /**
     * tortilla2.
     */
    private Tortilla tortilla2;
    /**
     * heatLevel.
     */
    private int heatLevel;

    /**
     * @return quesadilla quality.
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            && getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla()
                .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                .getCurrentTemperature() + getHeatLevel());
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
     * @return double quesadilla quality.
     */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
        < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla()
                .getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2()
                .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                + getHeatLevel());
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
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
            && getTortilla2().isToasted()) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
            && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
            && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        }
        if (!getQueso().isMelted() && !getTortilla().isToasted()
            && getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * @return queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * @param quesoO quesoO
     */
    public void setQueso(final Queso quesoO) {
        this.queso = quesoO;
    }

    /**
     * @return tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * @return tortilla2
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * @param tortillaO tortillaO
     */
    public void setTortilla(final Tortilla tortillaO) {
        this.tortilla = tortillaO;
    }

    /**
     * @param tortilla2O tortilla2O
     */
    public void setTortilla2(final Tortilla tortilla2O) {
        this.tortilla2 = tortilla2O;
    }

    /**
     * @return heatLevel
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * @param heat heat
     */
    public void setHeatLevel(final int heat) {
        this.heatLevel = heat;
    }
}
