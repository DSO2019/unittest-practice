package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
    * The queso type that will be used.
    */
    private Queso queso;

    /**
    * Tortilla used.
    */
    private Tortilla tortilla;

    /**
    * Second tortilla used in case of double quesadilla.
    */
    private Tortilla tortilla2;

    /**
    * Selected heat level for cooking the quesadilla.
    */
    private int heatLevel;

    /**
    *Function to prepare single quesadilla.
    *@return Final quesadilla result.
    */
    public static String prepareSingle() {
     while (getQueso().getCurrentTemperature()
        < getQueso().getMeltingTemperature()
     && getTortilla().getCurrentTemperature()
     < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
            getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(
            getQueso().getCurrentTemperature() + getHeatLevel());
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
    *Function to prepare doublequesadilla.
    *@return Final quesadilla result.
    */
    public static String prepareDouble() {
        while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            && getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()) {
                getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            && getTortilla2().getCurrentTemperature()
            < getTortilla2().getToastTemperature()) {
            getTortilla2().setCurrentTemperature(
                getTortilla2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla2().getCurrentTemperature()
                >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getTortilla().isToasted() && getTortilla2().isToasted()
         && getQueso().isMelted()) {
            return "Perfect quesadilla";
        }
        if (((!getTortilla().isToasted() && getTortilla2().isToasted())
            || (getTortilla().isToasted() && !getTortilla2().isToasted()))
            && getQueso().isMelted()) {
            return "Good quesadilla";
        }
        if ((getTortilla().isToasted() && getTortilla2().isToasted())
            && !getQueso().isMelted()) {
            return "Bad quesadilla";
        }
        if (!getTortilla().isToasted() && !getTortilla2().isToasted()
            && !getQueso().isMelted()) {
            return "You ran out of gas";
        }
        if (((!getTortilla().isToasted() && getTortilla2().isToasted())
            || (getTortilla().isToasted() && !getTortilla2().isToasted()))
            && !getQueso().isMelted()) {
            return "Terrible quesadilla";
        } else {
            return "Taco de queso";
          }
    }

    /**
    *Queso getter method.
    *@return queso used in the quesadilla.
    */
    public static Queso getQueso() {
        return queso;
    }

    /**
    *Queso setter method.
    *@param queso is the queso used.
    */
    public static void setQueso(final Queso queso) {
        this.queso = queso;
    }

    /**
    *The first tortilla used getter.
    *@return tortilla used.
    */
    public static Tortilla getTortilla() {
        return tortilla;
    }

    /**
    *The first tortilla used setter.
    *@param tortilla to use.
    */
    public static void setTortilla(final Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    /**
    *The second tortilla used getter.
    *@return tortilla used.
    */
    public static Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
    *The first tortilla used setter.
    *@param tortilla used.
    */
    public static void setTortilla2(final Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    /**
    *Gets the current heat level.
    *@return heatlevel selected.
    */
    public static int getHeatLevel() {
        return heatLevel;
    }

    /**
    *Setter method for heat level.
    *@param heatLevel the selected heat level.
    */
    public static void setHeatLevel(final int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
