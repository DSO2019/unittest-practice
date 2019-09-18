using Moq;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.test
{
    [TestFixture]
    class QuesadillaTest
    {
        public Quesadilla quesadilla;
        public Mock<Queso> mockedQueso;
        public Mock<Tortilla> mockedTortilla;

        [SetUp]
        public void setUp()
        {
            quesadilla = new Quesadilla();
            mockedQueso = new Mock<Queso>();
            mockedTortilla = new Mock<Tortilla>();
            quesadilla.setQueso(mockedQueso.Object);
            quesadilla.setTortilla(mockedTortilla.Object);
        }

        [TestCase]
        public void quesadillaPerfecta()
        {
            mockedQueso.Setup(q => q.isMelted()).Returns(true);
            mockedTortilla.Setup(t => t.isToasted()).Returns(true);
            mockedTortilla.Setup(t => t.getCurrentTemperature()).Returns(14);//I've got doubts
            mockedTortilla.Setup(t => t.getToastTemperature()).Returns(10);
            mockedQueso.Setup(q => q.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(q => q.getMeltingTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", quesadilla.prepareSingle());
            //mockedTortilla.Verify(t => t.toast(true),Times.Once); //Not working at the moment, need to ask the professor
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void quesadillaBuena()
        {
            mockedQueso.Setup(q => q.isMelted()).Returns(true);
            mockedTortilla.Setup(t => t.isToasted()).Returns(false);
            mockedTortilla.Setup(t => t.getCurrentTemperature()).Returns(14);//I've got doubts
            mockedTortilla.Setup(t => t.getToastTemperature()).Returns(20);
            mockedQueso.Setup(q => q.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(q => q.getMeltingTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void quesadillaTerrible()
        {
            mockedQueso.Setup(q => q.isMelted()).Returns(false);
            mockedTortilla.Setup(t => t.isToasted()).Returns(true);
            mockedTortilla.Setup(t => t.getCurrentTemperature()).Returns(14);//I've got doubts
            mockedTortilla.Setup(t => t.getToastTemperature()).Returns(20);
            mockedQueso.Setup(q => q.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(q => q.getMeltingTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void noHayGas()
        {
            mockedQueso.Setup(q => q.isMelted()).Returns(false);
            mockedTortilla.Setup(t => t.isToasted()).Returns(false);
            mockedTortilla.Setup(t => t.getCurrentTemperature()).Returns(14);//I've got doubts
            mockedTortilla.Setup(t => t.getToastTemperature()).Returns(20);
            mockedQueso.Setup(q => q.getCurrentTemperature()).Returns(14);
            mockedQueso.Setup(q => q.getMeltingTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }


    }
}
