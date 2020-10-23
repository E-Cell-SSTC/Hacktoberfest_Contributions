/**
* Binary search algorithm that takes an array of numbers, 
* and returns the position of the target
*
**/
public class BinarySearch {
  public int search(int[] nums, int target) {
      int pivot, left = 0, right = nums.length - 1;
      while (left <= right) {
        pivot = left + (right - left) / 2;
        if (nums[pivot] == target) return pivot;
        if (target < nums[pivot]) right = pivot - 1;
        else left = pivot + 1;
      }
      return -1;
    }
}

/**
* Driver class to test BinarySearch class's search algorithm
*
**/
public class Driver {
  public static void main (String[] args) {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    BinarySearch bs = new BinarySearch();
    System.out.println(bs.search(nums, 9));
  }
}
