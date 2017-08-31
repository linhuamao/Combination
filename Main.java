package jva.test;

public class Main {

	public static void main(String[] args) {

		Combination comb = new Combination();
		Object[] c = comb.getCombination(new String[] { "中国", "巴基斯坦", "朝鲜", "俄罗斯", "南非" }, 3);
		if (c != null && c.length > 0) {
			printArray(c);
		} else {
			System.out.println("null");
		}

	}

	private static void printArray(Object[] r) {
		for (int i = 0; i < r.length; i++) {
			Object[] temp = (Object[]) r[i];
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j]);
				if(j<temp.length-1){
					System.out.print("+-+");	
				}
			}
			System.out.println();
		}
	}

}
