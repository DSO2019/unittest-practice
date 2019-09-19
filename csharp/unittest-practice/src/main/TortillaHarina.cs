using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    class TortillaHarina
    {
        Boolean toasted;
        int temperature;
        int toasting = 20;

        public Boolean IsToasted()
        {
            return this.toasted;
        }

        public int GetToastTemperature()
        {
            return this.toasting;
        }

        public int GetCurrentTemperature()
        {
            return this.temperature;
        }
        public void SetCurrentTemperature(int temp)
        {
            this.temperature = temp;
        }
        public void Toast(bool toasted)
        {
            this.toasted = toasted;
        }


    }
}
