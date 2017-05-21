package Day06;

import java.text.SimpleDateFormat;
import java.util.Date;

//½«Date×ª³É 2012-12-21 14:28
public class DemoDateFormat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm" );
		String dateString=sdf.format(d);
		System.out.println(dateString);
	}

}
