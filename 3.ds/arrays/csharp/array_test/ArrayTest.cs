using System.Collections;
using System.Diagnostics;
using array_ds;

namespace array_test;

[TestClass]
public class ArrayTest
{
    [TestMethod]
    public void TestConstructor()
    {
        int[] data = [1, 2];

        ArrayCustom arrayCustom = new(data);

        Assert.AreEqual(data, arrayCustom.Data);
    }
}