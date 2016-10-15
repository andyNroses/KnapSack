public class Josephus {

	// k = 2
	public static int josephus(int n) {
		if (n == 1) {
			return 1;
		} else {
			if (n % 2 == 0)
				return 2 * josephus(n / 2) - 1;
			else
				return 2 * josephus((n - 1) / 2) + 1;
		}
	}

	//k = n
	public static int josephus(int n, int k) {
		if (n == 1) {
			return 0;
		} else {
			int j = josephus(n - 1, k);
			return (j + k) % n;
		}
	}

}