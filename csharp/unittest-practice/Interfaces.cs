namespace unittestpractice
{
    public interface IQueso
    {
        bool IsMelted();
        int GetCurrentTemperature();
        int GetMeltingTemperature();
        void SetCurrentTemperature(int temp);
        void Melt(bool melted);
    }

    public interface ITortilla
    {
        bool IsToasted();
        int GetToastTemperature();
        int GetCurrentTemperature();
        void SetCurrentTemperature(int temp);
        void Toast(bool toasted);

    }

}