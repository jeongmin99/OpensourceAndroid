package week7;


public class ex7_10 {

	public static <T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<T>();
		while (true) {
		T tmp;
		tmp = a.pop(); // ���� ���ÿ��� ��� �ϳ��� ����
		if (tmp==null) // ������ �����
		break;
		else
		s.push(tmp); // �� ���ÿ� ��Ҹ� ����
		}
		return s; // �� ������ ��ȯ
		}
	
	public static void main(String[] args) {
		// Double Ÿ���� GStack ����
		GStack<Double> gs =
		new GStack<Double>();
		// 5���� ��Ҹ� ���ÿ� push
		for (int i=0; i<5; i++) {
		gs.push(Double.valueOf(i));
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
		System.out.println(gs.pop());
		}
		}
}
