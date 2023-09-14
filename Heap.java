package HeapLec;

//A Heap is a special Tree-based data structure in which the tree is a complete binary tree.

//Max Heap:- In this heap, the value of the root node must be the greatest
// among all its child nodes and the same thing must be done for its left and right sub-tree also.

//Min Heap:- In this heap, the value of the root node must be the smallest
// among all its child nodes and the same thing must be done for its left and right sub-tree also.

//Heapify(UpHeapify and ):- It is the process to rearrange the elements to maintain the property of heap data structure.
// It is done when a certain node creates an imbalance in the heap due to some operations on that node.
// It takes O(log N) to balance the tree.

// time comlexity to add and remove and get min data in
//Sorted Array:- O(N) and O(N) and O(1)
//UnSorted Array:- O(1) and O(N) and O(N)
//Heap:- O(Log N) and O(Log N) and O(1)


//For Min Heap

//Left child index:- 2*(ParentIndex) + 1
//Right child index:- 2*(ParentIndex) + 2

import java.util.ArrayList;
public class Heap {
    private ArrayList<Integer> list;
    public Heap(){
        list=new ArrayList<>();
    }
    public void Add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }
    public int remove(){
        int rv=list.get(0);
        Swap(0,list.size()-1);
        list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }
    private void upheapify(int ci){//ci:- child index
        int pi=(ci-1)/2;//parent index
        if(list.get(pi)>list.get(ci)){
            Swap(pi,ci);
            upheapify(pi);
        }
    }
    private void downheapify(int pi){
        int lci=2*pi +1;
        int rci=2*pi +1;
        int mini=pi;//min index
        if(lci < list.size() && list.get(lci)<list.get(mini)){
            mini=lci;
        }
        if(rci < list.size() && list.get(rci)<list.get(mini)){
            mini=rci;
        }if(mini != pi){
            Swap(pi,mini);
        }
    }
    public void Swap(int pi,int ci){
        int temp=list.get(pi);
        list.set(pi,list.get(ci));
        list.set(ci,temp);
    }
    public int getMin(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
    public static void main(String[] args) {

    }
}
