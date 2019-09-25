using NUnit.Framework;
using unittestpractice.main;

namespace unittestpractice.test
{
    [TestFixture]
    internal class QuesoManchegoTest
    {
        private QuesoManchego _quesoManchego;

        [SetUp]
        public void Setup()
        {
            _quesoManchego = new QuesoManchego();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _quesoManchego.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoManchego.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseMelt()
        {
            _quesoManchego.Melt(false);
            Assert.IsFalse(_quesoManchego.IsMelted());
        }

        [TestCase]
        public void TestTrueMelt()
        {
            _quesoManchego.Melt(true);
            Assert.IsTrue(_quesoManchego.IsMelted());
        }

        [TestCase]
        public void TestMelting()
        {
            Assert.AreEqual(10, _quesoManchego.GetMeltingTemperature());
        }
    }
}
