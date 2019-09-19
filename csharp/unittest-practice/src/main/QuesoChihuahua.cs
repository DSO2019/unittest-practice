using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    class QuesoChihuahua : Queso
    {
        Boolean melted;
        int temperature;
        int melting = 20;

        public Boolean IsMelted()
        {
            return this.melted;
        }

        public int GetCurrentTemperature()
        {
            return this.temperature;
        }

        public int GetMeltingTemperature()
        {
            return this.melting;
        }

        public void SetCurrentTemperature(int temp)
        {
            this.temperature = temp;
        }

        public void Melt(Boolean melted)
        {
            this.melted = melted;
        }
    }
}
