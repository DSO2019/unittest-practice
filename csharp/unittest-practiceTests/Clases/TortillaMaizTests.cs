using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    [TestClass]
    public class TortillaMaizTests
    {
        //Asserts
        private readonly TortillaMaiz _tortillaMaiz = new TortillaMaiz();

        [TestMethod]
        public void testCurrentTemperature()
        {
            _tortillaMaiz.setCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaMaiz.getCurrentTemperature());
        }

        [TestMethod]
        public void testFalseToast()
        {
            _tortillaMaiz.toast(false);
            Assert.IsFalse(_tortillaMaiz.isToasted());
        }

        [TestMethod]
        public void testTrueToast()
        {
            _tortillaMaiz.toast(true);
            Assert.IsTrue(_tortillaMaiz.isToasted());
        }

        [TestMethod]
        public void testToasting()
        {
            Assert.AreEqual(35, _tortillaMaiz.getToastTemperature());
        }
    }
}




