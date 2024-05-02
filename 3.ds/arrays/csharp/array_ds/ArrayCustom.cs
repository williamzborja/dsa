namespace array_ds;

public class ArrayCustom
{
    int[] data;
    
    public int[] Data {
        get => data;
        set => data = value;
    }

    public ArrayCustom(int[] data)
    {
        this.data = data;
    }
}
