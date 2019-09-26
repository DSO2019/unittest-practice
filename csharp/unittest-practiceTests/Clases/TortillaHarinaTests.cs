using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    [TestClass]
    public class TortillaHarinaTests
    {
        //Asserts
        private readonly TortillaHarina _tortillaHarina = new TortillaHarina();

        [TestMethod]
        public void testCurrentTemperature()
        {
            _tortillaHarina.setCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaHarina.getCurrentTemperature());
        }

        [TestMethod]
        public void testFalseToast()
        {
            _tortillaHarina.toast(false);
            Assert.IsFalse(_tortillaHarina.isToasted());
        }

        [TestMethod]
        public void testTrueToast()
        {
            _tortillaHarina.toast(true);
            Assert.IsTrue(_tortillaHarina.isToasted());
        }

        [TestMethod]
        public void testToasting()
        {
            Assert.AreEqual(40, _tortillaHarina.getToastTemperature());
        }
    }
}

