public class armStrongBetweenNumbers {
public static void main(String[] args)
{
for(int orgNum=100;orgNum<=999;orgNum++){
	     int num=0;
	      int sum=0;
	      int digit=0;
	num=orgNum;
	while(num!=0) {
	digit=num%10;
	sum=sum + (digit*digit*digit);
	num=num/10;
	}
	if(orgNum==sum) {
	System.out.println(orgNum);
	}

	}

}
}


