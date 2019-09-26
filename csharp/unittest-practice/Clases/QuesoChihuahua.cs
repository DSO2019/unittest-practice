namespace unittestpractice.Clases
{
    public class QuesoChihuahua : IQueso
    {
        private bool _melted;
        private int _temperature;
        private const int Melting = 20;

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

        public void SetCurrentTemperature(int temp)
        {
            _temperature = temp;
        }

        public void Melt(bool melted)
        {
            _melted = melted;

        }
    }
}
