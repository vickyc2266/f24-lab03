package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation

    private SortedIntList sortedIntList;
    private int totalAdded;

    /**
     * Constructor for DelegationSortedIntList that initialized values for fields
     */
    public DelegationSortedIntList(){
        sortedIntList = new SortedIntList();
        totalAdded = 0;
    }

    /**
     * adds an element to the sortedIntList but through the internal SortedIntList
     * 
     * @params num representing the value being added into the SortedIntList
     * @return boolean representing whether the num has successfully be added 
     */
    public boolean add(int num){
        totalAdded += 1;
        //(gives the adding responsibility to the SortedIntList)
        return sortedIntList.add(num);
    }


    /**
     * adds all the elements inside of lists into sortedIntList
     * 
     * @params list that carries all the elements that will be absorbed by other list
     * @return boolean that produces true if all elements were added successfully and false if otherwise
     */
    public boolean addAll(IntegerList list) {
        // totalAdded += list.size();
        return sortedIntList.addAll(list);

    }

    /**
     * returns the total number of elements that have been added
     * 
     * @return an int value that represents the number of elements that have been added to the list
     */
    public int getTotalAdded(){
        return totalAdded;
    }

    /**
     * returns the int val that's at the index's index of sortedIntList
     * 
     * @param index the location of sortedIntList to extract from
     * @return element that's at the index location of sortedIntList
     */
    public int get(int index){
        return sortedIntList.get(index);
    }

    /**
     * returns whether the num being looked for has successfully been removed from the sortedIntList
     * 
     * @params num representing the value trying to be remved from the sortedIntList
     * @returns producing true if successfully removed num value and false otherwise
     */
    public boolean remove(int num) {
        return sortedIntList.remove(num);
    }

    /**
     * returns the length/size of sortedIntList currently
     * 
     * @returns int value representing how many values are in sortedIntList
     */
    public int size() {
        return sortedIntList.size();
    }
    
    /**
     * removes all the values of list from sortedIntList
     * 
     * @param list repsenting the list of elements that are desired to be removed
     * @return boolean representing whether all elements within list have been 
     * successfully removed from sortedIntList or false otherwise
     */
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }





}