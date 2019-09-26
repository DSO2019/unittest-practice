

using unittestpractice.Clases;
using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace unittest_practiceTests.Clases
{
    
    [TestClass()]
    public class QuesoManchegoTests
    {
        //Asserts

        readonly QuesoManchego _quesoManchego = new QuesoManchego();

        [TestMethod()]
        public void TestCurrentTemperature()
        {
            _quesoManchego.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoManchego.GetCurrentTemperature());
        }

        [TestMethod()]
        public void TestFalseMelt()
        {
            _quesoManchego.Melt(false);
            Assert.IsFalse(_quesoManchego.IsMelted());
        }
        [TestMethod()]
        public void TestTrueMelt()
        {
            _quesoManchego.Melt(true);
            Assert.IsTrue(_quesoManchego.IsMelted());
        }
        [TestMethod()]
        public void TestMelting()
        {
            Assert.AreEqual(25, _quesoManchego.GetMeltingTemperature());
        }
    }
}




