import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class test_p47 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���ӤH������");
		Integer test[] = new Integer[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    for(int i=0;i<test.length;i++) 
	    {
	    	String str = br.readLine();
	    	test[i] = Integer.parseInt(str);
	    }
	    
	    Arrays.sort(test,Collections.reverseOrder());
	    
	    for(int j=0;j<test.length;j++)
	    {
	    	System.out.println("��"+(j+1)+"�W�����ƬO"+test[j]+"��");
	    }
	    
			
	}

}
