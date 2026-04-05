import java.util.Scanner;

public class B_Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count[]=new int[5];
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
            count[x]++;
		}
        int ans=0;
        ans+=count[4];
        int min=Math.min(count[3],count[1]);
        count[3]=count[3]-min;
        count[1]=count[1]-min;
        ans+=min;
        if(count[3]>0){
            ans+=count[3];
        }

        ans+=count[2]/2;
        if(count[2]%2==1){
            count[2]=1;
        }

        int rem=count[1]+(count[2]==1?2:0);
        ans+=(rem/4);
        if(rem%4!=0)ans++;
        System.out.println(ans);

    }
}
