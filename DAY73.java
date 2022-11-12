//Problem Statement URL: https://leetcode.com/problems/find-median-from-data-stream/

//full data stream is divided into almost 2 parts : starting half is kept in max heap and the later half is kept in min heap since for finding median, we will require maximum of all the numbers in first half and minimum of all the numbers in the second half
class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        //if element at the top of the max heap is greater than num, then num has to be stored in max heap
        if(max.isEmpty() || max.peek()>=num){
            max.add(num);
        }
        else{
            min.add(num);
        }
        //the size of the heaps has to be almost equal(diff in size should be less than or equal to 1)
        //so if after adding the element, the size of the heaps are not almost equal, then remove one element from           the heap with greater size and add that element to the heap with lower size
        if(max.size()>min.size()+1){
            min.add(max.poll());
        }
        else if(max.size()<min.size()){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        //if heaps have unequal size, then that means there are odd number of elements in the data stream, hence we           need to return the peek of the heap with greater size
        if(max.size() == min.size()) return (max.peek()+min.peek())/2.0;
        else return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
