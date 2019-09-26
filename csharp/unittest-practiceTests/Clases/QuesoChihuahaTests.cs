using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    [TestClass()]
    public class QuesoChihuahaTests
    {
        //Asserts
        private readonly QuesoChihuahua _quesoChihuahua = new QuesoChihuahua();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            _quesoChihuahua.setCurrentTemperature(21);
            Assert.AreEqual(21, _quesoChihuahua.getCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseMelt()
        {
            _quesoChihuahua.melt(false);
            Assert.IsFalse(_quesoChihuahua.isMelted());
        }
        [TestMethod()]
        public void testTrueMelt()
        {
            _quesoChihuahua.melt(true);
            Assert.IsTrue(_quesoChihuahua.isMelted());
        }
        [TestMethod()]
        public void testMelting()
        {
            Assert.AreEqual(20, _quesoChihuahua.getMeltingTemperature());
        }
    }
}