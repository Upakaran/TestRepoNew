package package1;

public class SampleClass1 {

	public static void main(String[] args) {
		
		int hellCount = 0, yeahCount = 0;
		
		for(int i = 0; i <=100 ; i=i+5){
			System.out.print(i+" ");
			if(i%20==0){
				System.out.println("Hell");
				hellCount++;
			}
				
			else{
				System.out.println("Yeah");
				yeahCount++;
			}
				
		}
		System.out.println();
		System.out.println("Hell "+hellCount+" Yeah "+yeahCount);
		
		
		// line added in Branch 1

		// new line from remote
		
		System.out.println("multiplication is : ");
		System.out.println(ClassB.mult(hellCount, yeahCount));
	}

}
