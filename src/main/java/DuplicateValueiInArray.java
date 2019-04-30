
public class DuplicateValueiInArray {

	public static void main(String[] args) {
		
		
		String [] code = {"Java","Selenium","JavaScript","Python","JavaScript"};
			
//			for(int i=0;i<code.length;i++) {
//				
//				
//				System.out.println(code[i]);
//				
//			}
			
		for(int i=0;i<code.length;i++) {
			
			
			for(int j=i+1;j<code.length;j++) {
				
				if(code[i].equals(code[j])) {
					
					System.out.println("Duplicate Element is :"+code[i]);
					
				}
			}
			
			
		}
		
		
		}

	}

