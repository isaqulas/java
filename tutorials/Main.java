import java.util.Scanner;


public class Main{

	

	static int[] mySortc(int arr[])
	{
		
		for(int i = 0; i < arr.length; i++){
			int Small = i;
			for(int j = i; j < arr.length; j++){
				if(arr[j] < arr[Small]){
					
					Small = j;
					//System.out.println(Small); --> Debug
				}
			}
			System.out.println();

			int Small2 = arr[Small];
			arr[Small] = arr[i];
			arr[i] = Small2;
			//System.out.println("(" + arr[Small] + " ; " + arr[i] + ")");  --> Debug
			
		}
		return arr;
	}

	static int[] mySortd(int arr[])
	{
		for(int i = 0; i < arr.length; i++){
			int Small = arr[i];
			for(int j = i; j < arr.length; j++){
				if(arr[j] > Small){
					arr[i] = arr[j];
					arr[j] = Small;
					Small = arr[i];
				}
			}
		}
		return arr;
	}

	static void clear(){
		System.out.print("\033\143");
	}
	
	static void help(){
		clear();
		System.out.println("após executar, escreva uma array como essa:\n1,2,3,4,...");
		
	}




	public static void main(String[] args) {
		if(args.length >= 1){
			if (args[0].equals("h")){
				//System.out.println("após executar, escreva uma array como essa:\n1,2,3,4,...");
				help();
		}
		}
		else {
			Scanner input = new Scanner(System.in);

			while (true){
				
				String texto = "";
				if(input.hasNextLine()){
					texto = input.nextLine();
				}
				
				if(texto.equals("exit"))
				{
					break;
				}
				String str_arr[] = texto.split(",");
				int arr[] = new int [str_arr.length];
				for(int i = 0; i < str_arr.length; i++){
					arr[i] = Integer.parseInt(str_arr[i]);
					}
				int arr2[] = mySortc(arr);
				clear();
				for(int i : arr2){
					System.out.print(i + ", ");
				}
				System.out.println();
			}
			input.close();
		}
	}
}
