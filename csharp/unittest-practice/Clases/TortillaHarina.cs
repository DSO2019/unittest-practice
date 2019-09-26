

namespace unittestpractice.Clases
{
    public class TortillaHarina : ITortilla
    {
        private bool _toasted;
        private int _temperature;
        private int _toasting = 40;

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
            return _toasting;
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
