package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

 
public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int totalAdded;

    /**
     * constructor of the InheritanceSortedIntList class that initializes the value of totalAdded
     */
    public InheritanceSortedIntList() {
        totalAdded = 0;
    }

    /**
     * The total added counter increases when a number gets added to the list
     * 
     * @param num: the number to be added to the list
     * @return true if num was added successfully and false otherwise
     */
    public boolean add(int num){
        totalAdded += 1;
        //assuming that we're still calling the original add method
        return super.add(num);
    }

    /**
     * add all elements from another IntegerList list to the current list (superList)
     * 
     * @param list: the list that had numbers added to it
     * @return true if all elements were successdully added
     */
    public boolean addAll(IntegerList list){
        // totalAdded +=  list.size();
        return super.addAll(list); 

    }

    /**
     * get the total amount of values that was added to the list
     * @return int value of total int values added
     */
    public int getTotalAdded() {
        return totalAdded;
    }


}