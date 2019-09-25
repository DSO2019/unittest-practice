using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
namespace unittestpractice.Clases.Tests
{
    [TestClass()]
    public class QuesadillaTests
    {
        Quesadilla quesadilla;
        Mock<Queso> mockedQueso;
        Mock<Tortilla> mockedTortilla;
        //TODO ARTURO
        //Asserts
        [TestInitialize]
        public void setup()
        {
            quesadilla = new Quesadilla();
            mockedQueso = new Mock<Queso>();
            mockedTortilla = new Mock<Tortilla>();
            quesadilla.setQueso(mockedQueso.Object);
            quesadilla.setTortilla(mockedTortilla.Object);
            quesadilla.setHeatLevel(10);
        }

        [TestMethod()]
        public void quesadillaPerfecta()
        {
            mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void quesadillaBuena()
        {
            mockedQueso.Setup(foo => foo.isMelted()).Returns(true);
            mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(20);
            Assert.AreEqual("Good quesadilla", quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void quesadillaTerrible()
        {
            mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            mockedTortilla.Setup(foo => foo.isToasted()).Returns(true);
            mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void NoHayGas()
        {
            mockedQueso.Setup(foo => foo.isMelted()).Returns(false);
            mockedTortilla.Setup(foo => foo.isToasted()).Returns(false);
            mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(20);
            mockedTortilla.Setup(foo => foo.getCurrentTemperature()).Returns(14);
            mockedTortilla.Setup(foo => foo.getToastTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", quesadilla.prepareSingle());
        }

    }
}