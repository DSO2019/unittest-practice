
using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;
namespace unittest_practiceTests.Clases
{
    [TestClass()]
    public class QuesoChihuahaTests
    {
        //Asserts
        readonly QuesoChihuahua  _quesoChihuahua = new QuesoChihuahua();

        [TestMethod()]
        public void TestCurrentTemperature()
        {
            _quesoChihuahua.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoChihuahua.GetCurrentTemperature());
        }

        [TestMethod()]
        public void TestFalseMelt()
        {
            _quesoChihuahua.Melt(false);
            Assert.IsFalse(_quesoChihuahua.IsMelted());
        }
        [TestMethod()]
        public void TestTrueMelt()
        {
            _quesoChihuahua.Melt(true);
            Assert.IsTrue(_quesoChihuahua.IsMelted());
        }
        [TestMethod()]
        public void TestMelting()
        {
            Assert.AreEqual(25, _quesoChihuahua.GetMeltingTemperature());
        }
    }
}