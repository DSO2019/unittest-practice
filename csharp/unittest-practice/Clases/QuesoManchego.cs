namespace unittestpractice.Clases
{
    public class QuesoManchego : IQueso
    {
        private bool _melted;
        private int _temperature;
        private const int Melting = 25;

        public bool IsMelted()
        {
            return _melted;
        }

        public int GetCurrentTemperature()
        {
            return _temperature;
        }

        public int GetMeltingTemperature()
        {
            return Melting;
        }

        public void SetCurrentTemperature(int pTemp)
        {
            _temperature = pTemp;
        }

        public void Melt(bool pMelted)
        {
            _melted = pMelted;

        }
    }
}