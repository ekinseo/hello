package ssw.ekinseo;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Test {
    

    public static void main(String[] args) throws Exception {
    	Test test = new Test();
    	test.withDOMParse100();
    }
    
    public void chageNumber(Number number) {
        number.num1 = 20;
        number.num2 = 10;
    }
	public void withDOMParse100() {
		ParsingDOM pd=new ParsingDOM();
			pd.ParsingDOM("dummy100.xml");
	}
	
	public void withDOMParse1000() {
		ParsingDOM pd=new ParsingDOM();
		pd.ParsingDOM("dummy1000.xml");
	}
	
	public void withSAXParse100() throws Exception {
			ParseSAX handler = new ParseSAX();
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse("dummy100.xml", handler );
	}
	
	public void withSAXParse1000() throws Exception {
		ParseSAX handler = new ParseSAX();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse("dummy1000.xml", handler );
	}
    	
    public enum Day  {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    
}

