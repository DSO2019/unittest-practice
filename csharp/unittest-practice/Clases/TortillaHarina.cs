namespace unittestpractice.Clases
{
    public class TortillaHarina : ITortilla
    {
        private bool _toasted;
        private int _temperature;
        private const int Toasting = 40;

        public bool IsToasted()
        {
            return _toasted;
        }

        public int GetCurrentTemperature()
        {
            return _temperature;
        }

        public int GetToastTemperature()
        {
            return Toasting;
        }

        public void SetCurrentTemperature(int pTemp)
        {
            _temperature = pTemp;
        }

        public void Toast(bool pToasted)
        {
            _toasted = pToasted;
        }
    }

}