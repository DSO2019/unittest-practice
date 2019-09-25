namespace unittestpractice.main
{
    public interface IQueso
    {
        bool IsMelted();
        int GetCurrentTemperature();
        int GetMeltingTemperature();
        void SetCurrentTemperature(int temp);
        void Melt(bool melted);
     }
}
