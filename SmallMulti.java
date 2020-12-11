
public class SmallMulti{
	public static void main(String[] args){
		int answer = 0;
		int current = 20;
		while(true){
			for(int i=1;i<=20;i++){
				if(current%i!=0){
					break;
				}
				if(i==20){
					answer = current;
					System.out.println("\nThe answer is:"+answer);
					return;
				}
			}
			current+=20;
			System.out.print("Progress:"+current+"\r");
		}
	}
}