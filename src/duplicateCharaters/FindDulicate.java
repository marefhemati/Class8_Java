package duplicateCharaters;

public class FindDulicate {

	//Interview Question: I give you a string and a character, can you tell how many duplicate charater are in the string?
		//
		public static void main(String[] args) {
			
//			String st = "tomorrow";
//			char a  = 'o';
	////first we need to chap the string to character and we use tochar method like below
//			char[] x = st.toCharArray();
	////now we can use for each loop like below
//			int count = 0;
//			for(char b : x) {
//				if(b==a) {
//					count++;
//				}
//			}
//			System.out.println(count);
			
			
			
			System.out.println(getCharCountInString("door", 'o'));
		}
		//we can create a method of the above like below
			public static int getCharCountInString(String st, char c) {
				
				char[] x = st.toCharArray();
		
				int count = 0;
				for(char b : x) {
					if(b==c) {
						count++;
					}
				}
				return count;
			}
			}



