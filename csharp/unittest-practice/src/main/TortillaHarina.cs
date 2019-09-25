namespace unittestpractice.main
{
    internal class TortillaHarina
    {
        private bool _toasted;
        private int _temperature;
        private const int Toasting = 10;

        public bool IsToasted()
        {
            return _toasted;
        }

        public int GetToastTemperature()
        {
            return Toasting;
        }

        public int GetCurrentTemperature()
        {
            return _temperature;
        }
        public void SetCurrentTemperature(int temp)
        {
            _temperature = temp;
        }
        public void Toast(bool toast)
        {
            _toasted = toast;
        }


    }
}
