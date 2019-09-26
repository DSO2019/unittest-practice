using Microsoft.VisualStudio.TestTools.UnitTesting;

using unittestpractice;
using unittestpractice.Clases;
using Moq;
namespace unittest_practiceTests.Clases
{
    [TestClass]
    public class QuesadillaTests
    {
        private Quesadilla _quesadilla;
        private Mock<IQueso> _mockedQueso;
        private Mock<ITortilla> _mockedTortilla;
        private Mock<ITortilla> _mockedTortilla2;

        [TestInitialize]
        public void setup()
        {
            _quesadilla = new Quesadilla();
            _mockedQueso = new Mock<IQueso>();
            _mockedTortilla = new Mock<ITortilla>();
            _mockedTortilla2 = new Mock<ITortilla>();
            _quesadilla.SetQueso(_mockedQueso.Object);
            _quesadilla.SetTortilla(_mockedTortilla.Object);
            _quesadilla.SetTortilla2(_mockedTortilla2.Object);
            _quesadilla.SetHeatlevel(10);
        }

        [TestMethod]
        public void QuesadillaPerfecta()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", _quesadilla.PrepareSingle());
        }

        [TestMethod]
        public void QuesadillaBuena()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(20);
            Assert.AreEqual("Good quesadilla", _quesadilla.PrepareSingle());
        }

        [TestMethod]
        public void QuesadillaTerrible()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", _quesadilla.PrepareSingle());
        }

        [TestMethod]
        public void NoHayGas()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", _quesadilla.PrepareSingle());
        }

        [TestMethod]
        public void QuesadillaDoblePerfecta()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedTortilla2.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", _quesadilla.PrepareDouble());
        }

        [TestMethod]
        public void QuesadillaDobleBuena()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", _quesadilla.PrepareDouble());
        }

        [TestMethod]
        public void QuesadillaDobleRegular()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(20);
            Assert.AreEqual("Regular quesadilla", _quesadilla.PrepareDouble());
        }

        [TestMethod]
        public void QuesadillaDobleMala()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedTortilla2.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Bad quesadilla", _quesadilla.PrepareDouble());
        }

        [TestMethod]
        public void QuesadillaDobleTerrible()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.IsToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", _quesadilla.PrepareDouble());
        }

        [TestMethod]
        public void NoHayGasDopble()
        {
            _mockedQueso.Setup(foo => foo.IsMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.IsToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.GetMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.GetToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.GetCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.GetToastTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", _quesadilla.PrepareSingle());
        }

    }
}