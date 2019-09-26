﻿

namespace unittestpractice.Clases
{
    public class TortillaHarina : ITortilla
    {
        private bool _toasted;
        private int _temperature;
        private const int Toasting = 40;

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

        public void setCurrentTemperature(int temp)
        {
            _temperature = temp;
        }

        public void toast(bool toasted)
        {
            _toasted = toasted;
        }
    }

}
