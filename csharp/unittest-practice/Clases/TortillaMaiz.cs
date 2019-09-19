﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice.Clases
{
    public class TortillaMaiz : Tortilla
    {
        bool toasted;
        int temperature;
        int toasting = 35;

        public bool isToasted()
        {
            return this.toasted;
        }

        public int getCurrentTemperature()
        {
            return this.temperature;
        }

        public int getToastTemperature()
        {
            return this.toasting;
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
