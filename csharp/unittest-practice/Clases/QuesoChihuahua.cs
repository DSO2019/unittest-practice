namespace unittestpractice.Clases
{
    public class QuesoChihuahua : IQueso
    {
        private bool _melted;
        private int _temperature;
        private const int Melting = 20;

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

        public void setCurrentTemperature(int temp)
        {
            _temperature = temp;
        }

        public void melt(bool melted)
        {
            _melted = melted;

        }
    }
}
