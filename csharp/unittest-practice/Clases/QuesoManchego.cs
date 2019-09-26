namespace unittestpractice.Clases
{
    public class QuesoManchego :  IQueso
    {
        private bool _melted;
        private int _temperature;
        private const int Melting = 25;

        public bool isMelted()
        {
            return _melted;
        }

        public int getCurrentTemperature()
        {
            return _temperature;
        }

        public int getMeltingTemperature()
        {
            return Melting;
        }

        public void setCurrentTemperature(int pTemp)
        {
            _temperature = pTemp;
        }

        public void melt(bool pMelted)
        {
            _melted = pMelted;

        }
    }
}
