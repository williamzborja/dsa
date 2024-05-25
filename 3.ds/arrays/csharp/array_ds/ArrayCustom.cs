namespace array_ds;
using System.Collections;

public class ArrayCustom // ADT: Abstract Data Structure Static Array: ADT
{
    int[] data;

    // Static ArrayCustom -> ADT: Abstract Data Structure  Array: ADT
    // Dynamic ArrayDynamic -> Array Dynamic ADT -> ArrayList

    public int[] Data {
        get => data;
        set => data = value;
    }

    public ArrayCustom(int[] data)
    {
        this.data = data;
    }
}
