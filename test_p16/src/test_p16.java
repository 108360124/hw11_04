import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p16{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�Ja�άOb");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    char letter = str.charAt(0);

	    switch (letter)
	    {
	    	case 'a' :
	    	{
	    		System.out.println("��X���Oa");
	    		break;
	    	}
	    	case 'b' :
	    	{
	    		System.out.println("��X���Ob");
	    		break;
	    	}
	    	default :
	    	{
	    		System.out.println("�п�Ja�άOb");
	    		break;
	    	}
	    }
	    System.out.println("�����B�z");
	}

}
