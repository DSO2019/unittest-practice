using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    
    [TestClass]
    public class QuesoManchegoTests
    {
        //Asserts

        private readonly QuesoManchego _quesoManchego = new QuesoManchego();

        [TestMethod]
        public void testCurrentTemperature()
        {
            _quesoManchego.setCurrentTemperature(21);
            Assert.AreEqual(21, _quesoManchego.getCurrentTemperature());
        }

        [TestMethod]
        public void testFalseMelt()
        {
            _quesoManchego.melt(false);
            Assert.IsFalse(_quesoManchego.isMelted());
        }
        [TestMethod]
        public void testTrueMelt()
        {
            _quesoManchego.melt(true);
            Assert.IsTrue(_quesoManchego.isMelted());
        }
        [TestMethod]
        public void testMelting()
        {
            Assert.AreEqual(25, _quesoManchego.getMeltingTemperature());
        }
    }
}




