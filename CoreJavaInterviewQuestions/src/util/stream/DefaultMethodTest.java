package util.stream;

interface Parser {
	default void parse() {
		System.out.println("Default Parsing Logic from Interface!!");
	}

	static String sayHello(String name) {
		return "Hello " + name;
	}
}

class TextParser implements Parser {

}

class XmlParser implements Parser {
	@Override
	public void parse() {
		System.out.println("Default Parsing logic implemented inside XmlParser!!");
	}
}

public class DefaultMethodTest {

	public static void main(String[] args) {
		Parser p = new TextParser();
		p.parse();

		p = new XmlParser();
		p.parse();

		System.out.println(Parser.sayHello("Ram K K"));
	}

}