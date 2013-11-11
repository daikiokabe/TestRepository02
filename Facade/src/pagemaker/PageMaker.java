package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
	private PageMaker(){}

	public static void makeWelcomepage(String mailaddr, String filename) {
		try{
			Properties mailprop = DataBase.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + " 's page!");
			writer.paragraph(username + "のページへようこそ。");
			writer.paragraph("メール待ってますね。");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");

		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
