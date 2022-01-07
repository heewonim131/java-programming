package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		
		int temp = arr[mid];
		boolean find = false;
		
		while (left <= right) {
			
			if (target == temp) {	// 수를 찾은 경우
				find = true;
				break;
			}
			else if (target < temp) {	// 찾는 수가 작은 경우
				right = mid - 1;
			}
			else {	// 찾는 수가 큰 경우
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
			temp = arr[mid];
		}
		
		if (find) {
			mid++;
			System.out.println("찾는 수는 " + mid + "번째에 있습니다.");
		}
		else {
			System.out.println("찾는 수가 없습니다.");
		}
		
	}

}
