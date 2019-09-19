using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    public class QuesoChihuahua :  Queso
    {
        bool melted;
        int temperature;
        int melting = 25;

        public bool isMelted()
        {
            return this.melted;
        }

        public int getCurrentTemperature()
        {
            return this.temperature;
        }

        public int getMeltingTemperature()
        {
            return this.melting;
        }

        public void setCurrentTemperature(int temp)
        {
            this.temperature = temp;
        }

        public void melt(bool melted)
        {
            this.melted = melted;

        }
    }
}
