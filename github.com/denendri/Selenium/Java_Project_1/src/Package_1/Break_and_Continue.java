package Package_1;

public class Break_and_Continue {
		public static void main(String args[]){
			int x = 0;
			String words[]={"apple", "banana", "grapes"};
			while(x<words.length){
				if(words[x].equals("banana")){
					continue;
				}
				else{
					System.out.println(words[x]);
				}
			
			}
			x++;
		}
}
