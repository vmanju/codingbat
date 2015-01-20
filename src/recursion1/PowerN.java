package recursion1;

public class PowerN {
	public int powerN(int base, int n) {
		if (n == 0)
			return 1;

		if (n == 1)
			return base;

		int temp = powerN(base, n / 2);

		if ((n & 0x01) == 0) {
			return temp * temp;
		}

		return temp * temp * base;
	}
}
