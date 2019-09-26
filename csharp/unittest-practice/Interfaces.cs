
namespace unittestpractice
{
    public interface IQueso
    {
        bool isMelted();
        int getCurrentTemperature();
        int getMeltingTemperature();
        void setCurrentTemperature(int temp);
        void melt(bool melted);
    }

    public interface ITortilla
    {
        bool isToasted();
        int getToastTemperature();
        int getCurrentTemperature();
        void setCurrentTemperature(int temp);
        void toast(bool toasted);

    }



}
