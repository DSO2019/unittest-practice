namespace unittestpractice.main
{
    public interface ITortilla
    {
        bool IsToasted();
        int GetToastTemperature();
        int GetCurrentTemperature();
        void SetCurrentTemperature(int temp);
        void Toast(bool toasted);
    }
}
