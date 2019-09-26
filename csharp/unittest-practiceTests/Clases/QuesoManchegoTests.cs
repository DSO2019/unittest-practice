

using unittestpractice.Clases;
using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace unittest_practiceTests
{
    
    [TestClass()]
    public class QuesoManchegoTests
    {
        //Asserts

        readonly QuesoManchego quesoManchego = new QuesoManchego();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            quesoManchego.SetCurrentTemperature(21);
            Assert.AreEqual(21, quesoManchego.GetCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseMelt()
        {
            quesoManchego.Melt(false);
            Assert.IsFalse(quesoManchego.IsMelted());
        }
        [TestMethod()]
        public void testTrueMelt()
        {
            quesoManchego.Melt(true);
            Assert.IsTrue(quesoManchego.IsMelted());
        }
        [TestMethod()]
        public void testMelting()
        {
            Assert.AreEqual(25, quesoManchego.GetMeltingTemperature());
        }
    }
}




