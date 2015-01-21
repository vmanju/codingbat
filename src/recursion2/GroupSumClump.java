package recursion2;

/*
 * 
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values). 

groupSumClump(0, {2, 4, 8}, 10) → true
groupSumClump(0, {1, 2, 4, 8, 1}, 14) → true
groupSumClump(0, {2, 4, 4, 8}, 14) → false

groupSumClump(0, {2, 4, 8}, 10) → true	true	OK	    
groupSumClump(0, {1, 2, 4, 8, 1}, 14) → true	true	OK	    
groupSumClump(0, {2, 4, 4, 8}, 14) → false	false	OK	    
groupSumClump(0, {8, 2, 2, 1}, 9) → true	true	OK	    
groupSumClump(0, {8, 2, 2, 1}, 11) → false	false	OK	    
groupSumClump(0, {1}, 1) → true	true	OK	    
groupSumClump(0, {9}, 1) → false	false	OK
 */
public class GroupSumClump {
	public boolean groupSumClump(int start, int[] nums, int target) {

		if (start >= nums.length)
			return target == 0;

		int sum = nums[start], temp = start + 1;
		while (temp < nums.length && nums[temp] == nums[start]) {
			sum += nums[temp++];
		}

		return groupSumClump(temp, nums, target - sum)
				|| groupSumClump(temp, nums, target);
	}
}
