import java.util.Scanner;


public class Main{

	

	static int[] mySortc(int arr[])
	{
		for(int i = 0; i < arr.length; i++){
			int Small = arr[i];
			for(int j = i; j < arr.length; j++){
				if(arr[j] < Small){
					arr[i] = arr[j];
					arr[j] = Small;
					Small = arr[j];
				}
			}
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
				System.out.println("após executar, escreva uma array como essa:\n1,2,3,4,...");
				//help();
		}
		System.out.println(args[0]);
		}
		else {
		
			while (true){
				Scanner inputa = new Scanner(System.in);	
				String texto = inputa.next();
				inputa.close();
				if(texto.equals("exit")){
					break;
				}
				else{

					int arr[] = {0, 3, 5, 6, 9, 2};
					int arr2[] = mySortc(arr);
					for(int i : arr2){
						System.out.print(i + ", ");
					}
					System.out.println();
				}
				
			}
		}
	}
}
