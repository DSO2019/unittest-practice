using NUnit.Framework;
using unittestpractice.main;

namespace unittestpractice.test
{
    [TestFixture]
    internal class TortillaHarinaTest
    {
        private TortillaHarina _tortillaHarina;

        [SetUp]
        public void SetUp ()
        {
            _tortillaHarina = new TortillaHarina();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _tortillaHarina.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaHarina.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseToas()
        {
            _tortillaHarina.Toast(false);
            Assert.IsFalse(_tortillaHarina.IsToasted());
        }

        [TestCase]
        public void TestTrueToast()
        {
            _tortillaHarina.Toast(true);
            Assert.IsTrue(_tortillaHarina.IsToasted());
        }

        [TestCase]
        public void TestToasting()
        {
            Assert.AreEqual(10, _tortillaHarina.GetToastTemperature());
        }
    }
}
