package mx.iteso.ut;
/**
 * Hello world!
 *
 */
public class Quesadilla {
/** Queso variable.*/
private Queso queso;
/** Variable para tortilla #1.*/
private Tortilla tortilla;
/** Variable para tortilla #2.*/
private Tortilla tortilla2;
/** Variable para nivel de cocción.*/
private int heatLevel;
/** Método para preparar quesadilla simple.
*@return String contiene el resultado.
*/
public String prepareSingle() {
while (
getQueso().getCurrentTemperature()
< getQueso().getMeltingTemperature()
&& getTortilla().getCurrentTemperature()
< getTortilla().getToastTemperature()) {
   getTortilla().setCurrentTemperature(
   getTortilla().getCurrentTemperature()
   + getHeatLevel());
   getQueso().setCurrentTemperature(
   getQueso().getCurrentTemperature()
    + getHeatLevel());
   if (getTortilla().getCurrentTemperature()
       >=
       getTortilla().getToastTemperature()) {
       getTortilla().toast(true);
       }
   if (getQueso().getCurrentTemperature()
      >=
      getQueso().getMeltingTemperature()) {
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

    /** Método para preparar Quesadilla doble.
     *  @return String regresa el resultado.
    */
    public String prepareDouble() {

      while (
           getQueso().getCurrentTemperature()
           <
           getQueso().getMeltingTemperature()
           && getTortilla().getCurrentTemperature()
           <
           getTortilla().getToastTemperature()
           &&
           getTortilla2().getCurrentTemperature()
           < getTortilla2().getToastTemperature()) {
           getTortilla().setCurrentTemperature(
           getTortilla().getCurrentTemperature()
           + getHeatLevel());

           getTortilla2().setCurrentTemperature(
           getTortilla2().getCurrentTemperature()
           + getHeatLevel());

           getQueso().setCurrentTemperature(
           getQueso().getCurrentTemperature()
           + getHeatLevel());
           if (getTortilla().getCurrentTemperature()
           >=
           getTortilla().getToastTemperature()) {
           getTortilla().toast(true);
           }
           if (getQueso().getCurrentTemperature()
           >=
           getQueso().getMeltingTemperature()) {
           getQueso().melt(true);
           }
           if (getTortilla2().getCurrentTemperature()
           >=
           getTortilla2().getToastTemperature()) {
           getTortilla2().toast(true);
           }
        }

           if (getQueso().isMelted()
           && getTortilla().isToasted()
           && getTortilla2().isToasted()) {
           return "Quesadilla perfecta";
        }
           if (getQueso().isMelted()
           && !getTortilla().isToasted()
           && getTortilla2().isToasted()) {
           return "Quesadilla Buena";
        }
           if (getQueso().isMelted()
           && getTortilla().isToasted()
           && !getTortilla2().isToasted()) {
           return "Quesadilla Buena";
        }
           if (!getQueso().isMelted()
           && getTortilla().isToasted()
           && getTortilla2().isToasted()) {
           return "Quesadilla Mala";
        }
            if (!getQueso().isMelted()
            && !getTortilla().isToasted()
            && getTortilla2().isToasted()) {
            return "Quesadilla Terrible";
        }
            if (!getQueso().isMelted()
            && getTortilla().isToasted()
            && !getTortilla2().isToasted()) {
            return "Quesadilla Terrible";
         }
            if (getQueso().isMelted()
            && !getTortilla().isToasted()
            && !getTortilla2().isToasted()) {
            return "Quesadilla Regular";
         } else {
            return "No se cocinó";
         }
    }

    /** Getter.
     * @return Queso.
    */
    public Queso getQueso() {
        return queso;
    }

    /** Setter.
     * @param cheese Queso
    */
    public void setQueso(final Queso cheese) {
        this.queso = cheese;
    }

    /** Getter.
     * @return tortilla.
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /** Getter.
     * @return tortilla2.
    */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /** Setter.
     * @param primerTortilla Tortilla
    */
    public void setTortilla(final Tortilla primerTortilla) {
        this.tortilla = primerTortilla;
    }

    /** Setter.
     * @param segundaTortilla Tortilla
    */
    public void setTortilla2(final Tortilla segundaTortilla) {
        this.tortilla2 = segundaTortilla;
    }

    /** Getter.
     * @return heatlevel.
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /** Setter.
     * @param calor int
    */
    public void setHeatLevel(final int calor) {
        this.heatLevel = calor;
    }
}


