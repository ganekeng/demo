
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai");
		String name = "abcdefghi";
		String find ="def";
		char[] nameArr = name.toCharArray();
		char[][] nameArry = new char[find.length()][find.length()];
		for(int i=0,j=0; i< nameArr.length; i++) {
			System.out.println("i =" +i+","+j +": mod:"+i%find.length()+" :valuue ="+ i%find.length()+ ":  data =" + nameArr[i]);
			nameArry[j][i%find.length()] = nameArr[i];
			if(i%find.length() == 2){
				j++;
			}
		}
		
		

	}

}
