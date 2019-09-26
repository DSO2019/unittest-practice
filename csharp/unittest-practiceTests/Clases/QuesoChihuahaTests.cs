
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
        public void testCurrentTemperature()
        {
            _quesoChihuahua.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoChihuahua.GetCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseMelt()
        {
            _quesoChihuahua.Melt(false);
            Assert.IsFalse(_quesoChihuahua.IsMelted());
        }
        [TestMethod()]
        public void testTrueMelt()
        {
            _quesoChihuahua.Melt(true);
            Assert.IsTrue(_quesoChihuahua.IsMelted());
        }
        [TestMethod()]
        public void testMelting()
        {
            Assert.AreEqual(25, _quesoChihuahua.GetMeltingTemperature());
        }
    }
}