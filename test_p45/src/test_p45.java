import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p45 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���ӤH������");
		int[] test = new int[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    for(int i=0;i<test.length;i++) 
	    {
	    	String str = br.readLine();
	    	test[i] = Integer.parseInt(str);
	    }
	    
	    for(int s=0;s<test.length-1;s++)
	    {
	    	for(int t=s+1;t<test.length;t++)
	    	{
	    		if(test[t]>test[s])
	    		{
	    			int tmp = test[t];
	    			test[t]=test[s];
	    			test[s]=tmp;
	    		}
	    	}
	    }
	    
	    for(int j=0;j<test.length;j++)
	    {
	    	System.out.println("��"+(j+1)+"�W�����ƬO"+test[j]+"��");
	    }
	    
			
	}

}
