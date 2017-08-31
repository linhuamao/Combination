package jva.test;

import java.util.ArrayList;

public class Combination {

	public Object[][] getCombination(Object[] shuzu, int m) {

		if (shuzu == null || shuzu.length == 0 || m > shuzu.length || m < 1) {
			return null;
		}

		if (m == 1) {
			Object[][] r = new Object[shuzu.length][1];
			for (int i = 0; i < shuzu.length; i++) {
				r[i][0] = shuzu[i];
			}
			return r;
		}

		ArrayList<Object[]> al = new ArrayList<Object[]>();
		for (int i = 0; i < shuzu.length; i++) {
			Object first = shuzu[i];

			Object[] subArray = getSubArray(shuzu, i + 1);

			Object[][] temp = getCombination(subArray, m - 1);
			if (temp != null) {
				for (int j = 0; j < temp.length; j++) {
					Object[] r = addHead(first, temp[j]);
					al.add(r);
				}
			}

		}

		Object[][] result = new Object[al.size()][];
		for (int i = 0; i < result.length; i++) {
			result[i] = al.get(i);
		}

		return result;
	}

	private Object[] getSubArray(Object[] shuzu, int startIndex) {
		Object[] r = new Object[shuzu.length - startIndex];
		int count = 0;
		for (int i = startIndex; i < shuzu.length; i++) {
			r[count++] = shuzu[i];
		}
		return r;
	}

	private Object[] addHead(Object head, Object[] tail) {
		Object[] result = new Object[tail.length + 1];

		result[0] = head;
		for (int i = 1; i < result.length; i++) {
			result[i] = tail[i - 1];
		}
		return result;
	}

}
