package problemb;

import java.math.BigInteger;

public class VeryBeautifulNumber {

	private static final BigInteger TEN = BigInteger.valueOf(10);

	private static int p;
	private static int x;

	private static void mock() {
		p = 6;
		x = 5;
	}

	private static boolean isVeryBeautifulNumber(BigInteger i, BigInteger j,
			BigInteger min) {
		BigInteger[] array = i.divideAndRemainder(TEN);
		BigInteger newJ = array[0];
		BigInteger lastDigit = array[1];
		newJ = newJ.add(min.multiply(lastDigit));

		return newJ.equals(j);
	}

	public static void main(String[] args) {
		mock();

		// for (int p = 2; p < 10; p++) {
		// for (int x = 1; x < 10; x++) {
		final BigInteger min = TEN.pow(p - 1);
		final BigInteger max = TEN.pow(p).subtract(BigInteger.ONE);
		BigInteger bigX = BigInteger.valueOf(x);
		BigInteger result = null;
		for (BigInteger i = min; i.compareTo(max) < 0; i = i
				.add(BigInteger.ONE)) {
			BigInteger multiplier = i.multiply(bigX);
			for (BigInteger j = multiplier; j.compareTo(max) < 0; j = j
					.add(multiplier)) {
				if (isVeryBeautifulNumber(i, j, min)) {
					result = i;
				}
			}
		}
		if (result != null) {
			System.out.println(/*"x = " + x + ", p = " + p + ": " +*/ result);
		} else {
			System.out.println(/*"x = " + x + ", p = " + p + ": " +*/ "Impossible");
		}
		// }
		// }

	}

}
