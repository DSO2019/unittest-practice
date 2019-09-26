﻿

namespace unittestpractice.Clases
{
    public class TortillaMaiz : ITortilla
    {
        private bool _toasted;
        private int _temperature;
        private const int Toasting = 35;

        public bool isToasted()
        {
            return _toasted;
        }

        public int getCurrentTemperature()
        {
            return _temperature;
        }

        public int getToastTemperature()
        {
            return Toasting;
        }

        public void setCurrentTemperature(int pTemp)
        {
            _temperature = pTemp;
        }

        public void toast(bool pToasted)
        {
            _toasted = pToasted;
        }
    }

    

}
