using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice
{
    class TortillaMaiz : Tortilla
    {
        bool toasted;
        int temperature;
        int toasting = 20;
        public bool isToasted()
        {
            return this.toasted;
        }

        public int getToastTemperature()
        {
            return this.toasting;
        }

        public int getCurrentTemperature()
        {
            return this.temperature;
        }

        public void setCurrentTemperature(int temp)
        {
            this.temperature = temp;
        }

        public void toast(bool toasted)
        {
            this.toasted = toasted;
        }
    }
}
