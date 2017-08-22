package ssw.ekinseo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.mysql.jdbc.Connection;



public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.retrieveRows();
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		
	}
	public void retrieveRows() throws SQLException {
		final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://ekinseo.ipdisk.co.kr/_tmp","root","1234");
		final Statement stmt = connection.createStatement();
		final ResultSet rs = stmt.executeQuery("Select * from employees");
		final Map<Integer, String> employeeMap = new HashMap<>();
		
		while(rs.next()) {
			final int employeeNumber = rs.getInt("employee_number");
			final String title = rs.getString("TITLE");
			final String name = rs.getString("name");
			employeeMap.put(employeeNumber, name);
			
			System.out.print(employeeNumber);
			System.out.print(" : ");
			System.out.print(name);
			System.out.print(" : ");
			System.out.println(title);
		}
		System.out.println(employeeMap.get(1));
		rs.close();
		stmt.close();
		
	}

	
	
	
	

	private void makeObject() {
		Integer[] intArr = new Integer[1024000];
		ArrayList<Integer> list = new ArrayList<Integer>(1024000);
		for (int loop = 0; loop < 1024; loop++) {
			intArr[loop] = loop;
			list.add(loop);
		}
	}

	public void chageNumber(Number number) {
		number.num1 = 20;
		number.num2 = 10;
	}

	public void withDOMParse100() {
		ParsingDOM pd = new ParsingDOM();
		pd.ParsingDOM("dummy100.xml");
	}

	public void withDOMParse1000() {
		ParsingDOM pd = new ParsingDOM();
		pd.ParsingDOM("dummy1000.xml");
	}

	public void withSAXParse100() throws Exception {
		ParseSAX handler = new ParseSAX();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse("dummy100.xml", handler);
	}

	public void withSAXParse1000() throws Exception {
		ParseSAX handler = new ParseSAX();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse("dummy1000.xml", handler);
	}

	public enum Day {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	
}
