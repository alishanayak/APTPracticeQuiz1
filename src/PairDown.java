public class PairDown {
	public int[] fold(int[] list) {
		int[] retArr;
		if (list.length % 2 == 0) {
			retArr = new int[list.length / 2];
			for (int i = 0; i < list.length - 1; i = i + 2) {
				int val = list[i] + list[i + 1];
				retArr[i / 2] = val;
			}
		} else {
			retArr = new int[list.length / 2 + 1];
			for (int i = 0; i < list.length - 2; i = i + 2) {
				int val = list[i] + list[i + 1];
				retArr[i / 2] = val;
			}
			retArr[retArr.length - 1] = list[list.length - 1];
		}

		return retArr;
	}
}