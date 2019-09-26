using Moq;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using unittestPractice.main;

namespace unittestPractice.tests
{
    [TestFixture]
    internal class QuesadillaTest
    {
        public Quesadilla Quesadilla;
        public Mock<IQueso> MockedQueso;
        public Mock<ITortilla> MockedTortilla1;
        public Mock<ITortilla> MockedTortilla2;


        [SetUp]
        public void SetUp()
        {
            Quesadilla = new Quesadilla();
            MockedQueso = new Mock<IQueso>();
            MockedTortilla1 = new Mock<ITortilla>();
            MockedTortilla2 = new Mock<ITortilla>();
            Quesadilla.SetQueso(MockedQueso.Object);
            Quesadilla.SetTortilla1(MockedTortilla1.Object);
            Quesadilla.SetTortilla2(MockedTortilla2.Object);
        }

        [TestCase]
        public void QuesadillaPerfecta()
        {
            MockedQueso.Setup(q => q.IsMelted()).Returns(true);
            MockedTortilla1.Setup(t => t.IsToasted()).Returns(true);
            MockedTortilla1.Setup(t => t.GetCurrentTemperature()).Returns(14);//I've got doubts
            MockedTortilla1.Setup(t => t.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(q => q.GetCurrentTemperature()).Returns(14);
            MockedQueso.Setup(q => q.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", Quesadilla.prepareSingle());
            //mockedTortilla.Verify(t => t.toast(true),Times.Once); //Not working at the moment, need to ask the professor
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void QuesadillaBuena()
        {
            MockedQueso.Setup(q => q.IsMelted()).Returns(true);
            MockedTortilla1.Setup(t => t.IsToasted()).Returns(false);
            MockedTortilla1.Setup(t => t.GetCurrentTemperature()).Returns(14);//I've got doubts
            MockedTortilla1.Setup(t => t.GetToastTemperature()).Returns(20);
            MockedQueso.Setup(q => q.GetCurrentTemperature()).Returns(14);
            MockedQueso.Setup(q => q.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", Quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void QuesadillaTerrible()
        {
            MockedQueso.Setup(q => q.IsMelted()).Returns(false);
            MockedTortilla1.Setup(t => t.IsToasted()).Returns(true);
            MockedTortilla1.Setup(t => t.GetCurrentTemperature()).Returns(14);//I've got doubts
            MockedTortilla1.Setup(t => t.GetToastTemperature()).Returns(20);
            MockedQueso.Setup(q => q.GetCurrentTemperature()).Returns(14);
            MockedQueso.Setup(q => q.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", Quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void NoHayGas()
        {
            MockedQueso.Setup(q => q.IsMelted()).Returns(false);
            MockedTortilla1.Setup(t => t.IsToasted()).Returns(false);
            MockedTortilla1.Setup(t => t.GetCurrentTemperature()).Returns(14);//I've got doubts
            MockedTortilla1.Setup(t => t.GetToastTemperature()).Returns(20);
            MockedQueso.Setup(q => q.GetCurrentTemperature()).Returns(14);
            MockedQueso.Setup(q => q.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", Quesadilla.prepareSingle());
            //mockedTortilla.Verify(t =>  t.toast(true), Times.Never);
            //mockedQueso.Verify(q => q.melt(true), Times.Once);
        }

        [TestCase]
        public void QuesadillaPerfectaDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(15);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", Quesadilla.PrepareDouble());
        }
        [TestCase]
        public void QuesadillaBuenaDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(false);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(5);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaRegularDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(false);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(5);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Regular quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaTerribleDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(8);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(20);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(5);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaMalaDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(15);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(5);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Mala quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void NoHayGasDoble()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla1.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla2.Setup(tortilla1 => tortilla1.IsToasted()).Returns(false);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(12);
            MockedTortilla2.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(2);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", Quesadilla.PrepareDouble());
        }




    }
}
