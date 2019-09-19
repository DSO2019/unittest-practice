package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla1;
    private Tortilla tortilla2;
    private int heatLevel;

    public String prepareSingle(){

     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla1().getCurrentTemperature()< getTortilla1().getToastTemperature()){
        getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
         getTortilla1().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
     }

     if(getQueso().isMelted() && getTortilla1().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla1().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla1().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";

    }

    public String prepareDouble(){
        
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() 
        && getTortilla1().getCurrentTemperature()< getTortilla1().getToastTemperature()
        && getTortilla2().getCurrentTemperature()< getTortilla2().getToastTemperature()){

            getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
                getTortilla1().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature())
                getTortilla2().toast(true);
         }
        
        if(getQueso().isMelted() && getTortilla1().isToasted() && getTortilla2().isToasted())
         return "Perfect quesadilla";
        if(getQueso().isMelted() && !getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Good quesadilla";
        if(getQueso().isMelted() && getTortilla1().isToasted() && !getTortilla2().isToasted())
            return "Good quesadilla";
        if(!getQueso().isMelted() && getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Bad quesadilla";
        if(!getQueso().isMelted() && !getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Terrible quesadilla";
        if(!getQueso().isMelted() && getTortilla1().isToasted() && !getTortilla2().isToasted())
            return "Terrible quesadilla";
        if(!getQueso().isMelted() && !getTortilla1().isToasted() && !getTortilla2().isToasted())
            return "You ran out of gas";
        else
            return "Regular quesadilla";
    
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }


    public Tortilla getTortilla1() {
        return tortilla1;
    }

    public Tortilla getTortilla2() {
        return tortilla2;
    }

  /*  public void setTortilla(Tortilla tortilla1) {
        this.tortilla1 = tortilla1;  
    }*/

    public void setTortilla(Tortilla tortilla1, Tortilla tortilla2) {
        this.tortilla1 = tortilla1;
        this.tortilla2 = tortilla2;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
