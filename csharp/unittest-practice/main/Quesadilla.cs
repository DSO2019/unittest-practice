using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice
{
    class Quesadilla
    {
        private Queso queso;
        private Tortilla tortilla;
        private int heatLevel;

        public String prepareSingle()
        {
            while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature())
            {
                getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
                getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
                if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                    getTortilla().toast(true);
                if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                    getQueso().melt(true);
            }
            if (getQueso().isMelted() && getTortilla().isToasted())
                return "Perfect quesadilla";
            if (getQueso().isMelted() && !getTortilla().isToasted())
                return "Good quesadilla";
            if (!getQueso().isMelted() && getTortilla().isToasted())
                return "Terrible quesadilla";
            else
                return "You ran out of gas";
        }


        public String prepareDouble()
        {
            return "";
        }

        public Queso getQueso()
        {
            return queso;
        }

        public void setQueso(Queso queso)
        {
            this.queso = queso;
        }

        public Tortilla getTortilla()
        {
            return tortilla;
        }

        public void setTortilla(Tortilla tortilla)
        {
            this.tortilla = tortilla;
        }

        public int getHeatLevel()
        {
            return heatLevel;
        }

        public void setHeatLevel(int heatLevel)
        {
            this.heatLevel = heatLevel;
        }

    }
}
