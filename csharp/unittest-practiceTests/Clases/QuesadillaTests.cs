using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using unittestpractice;
using unittestpractice.Clases;

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
            _quesadilla.setQueso(_mockedQueso.Object);
            _quesadilla.setTortilla(_mockedTortilla.Object);
            _quesadilla.setTortilla2(_mockedTortilla2.Object);
            _quesadilla.setHeatLevel(10);
        }

        [TestMethod]
        public void quesadillaPerfecta()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", _quesadilla.prepareSingle());
        }

        [TestMethod]
        public void quesadillaBuena()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(20);
            Assert.AreEqual("Good quesadilla", _quesadilla.prepareSingle());
        }

        [TestMethod]
        public void quesadillaTerrible()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", _quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void noHayGas()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", _quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void quesadillaDoblePerfecta()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            _mockedTortilla2.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", _quesadilla.prepareDouble());
        }

        [TestMethod()]
        public void quesadillaDobleBuena()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", _quesadilla.prepareDouble());
        }

        [TestMethod()]
        public void quesadillaDobleRegular()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.isToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(20);
            Assert.AreEqual("Regular quesadilla", _quesadilla.prepareDouble());
        }

        [TestMethod()]
        public void quesadillaDobleMala()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            _mockedTortilla2.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Bad quesadilla", _quesadilla.prepareDouble());
        }

        [TestMethod()]
        public void quesadillaDobleTerrible()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedTortilla2.Setup(foo => foo.isToasted()).Returns(true);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(20);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", _quesadilla.prepareDouble());
        }

        [TestMethod()]
        public void noHayGasDopble()
        {
            _mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            _mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            _mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            _mockedTortilla2.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            _mockedTortilla2.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", _quesadilla.prepareSingle());
        }

    }
}