package HeapLec;

public class Heap_client {
    public static void main(String[] args) {
        Heap hp=new Heap();
        //Min Heap
        hp.Add(5);
        hp.Add(7);
        hp.Add(6);
        hp.Add(1);
        hp.Add(4);
        hp.Add(9);
        hp.Add(7);
        hp.Add(3);
        hp.Display();
    }
}
