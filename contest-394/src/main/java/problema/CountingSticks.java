package problema;

public class CountingSticks {

	public static void main(String[] args) {
		String[] inputs = new String[] { "||+|=|||||", "|||||+||=||", "|+|=||||||", "||||+||=||||||", "|+|||=||" };
		for (String input : inputs) {
			String[] split = input.split("=");
			if (split[0].length() + 1 == split[1].length()) {
				System.out
						.println("|" + input.substring(0, input.length() - 1));
			} else if (split[0].length() == split[1].length() + 3) {
				if (split[0].indexOf("+") == 1) {
					System.out.println(input.substring(0, 2) + input.substring(3) + "|");
				} else {
					System.out.println(input.substring(1) + "|");
				}
			} else if (split[0].length() == split[1].length() + 1) {
				System.out.println(input);
			} else {
				System.out.println("Impossible");
			}
		}
	}

}
