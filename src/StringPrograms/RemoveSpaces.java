package StringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {

		String str = "Hello    Everyone";
		str = str.replaceAll("\\s ", "");

		System.out.println(str);

	}

}
