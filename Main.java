import java.util.Scanner;

class sorts{
	public int[] mySortc(int arr[])
	{
		for(int i = 0; i < arr.length; i++){
			int Small = i;
			for(int j = i; j < arr.length; j++){
				if(arr[j] < arr[Small])
				{
					Small = j;
				}
			}
			System.out.println();
			int Small2 = arr[Small];
			arr[Small] = arr[i];
			arr[i] = Small2;
		}
		return arr;
	}

	public int[] mySortd(int arr[])
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
}

public class Main
{
	static void clear()
	{
		System.out.print("\033\143");
	}
	
	static void help()
	{
		clear();
		System.out.println("após selecionar a ordem, escreva uma array como essa:\n1,2,3,4,...");
		
	}

	static int[] recive_sort(Scanner input)
	{
		String texto = "";
		if(input.hasNextLine())
				{
					texto = input.nextLine();
				}
		String str_arr[] = texto.split(",");
		int arr[] = new int [str_arr.length];
		for(int i = 0; i < str_arr.length; i++){
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		return arr;
	}


	public static void main(String[] args) 
	{
		clear();
		sorts sorts = new sorts();
		
		if(args.length >= 1)
		{
			if (args[0].equals("h")){
				//System.out.println("após executar, escreva uma array como essa:\n1,2,3,4,...");
				help();
		}
		}
		else
		{

			Scanner input = new Scanner(System.in);

			while (true)
			{
				System.out.println("\ndigite exit/help/crescente/decrescente:\n");
				int arr2[];
				String texto = "";
				if(input.hasNextLine())
				{
					texto = input.nextLine();
				}
				
				if(texto.equals("exit"))
				{
					break;
				}
				else if(texto.equals("crescente"))
				{
					clear();
					arr2 = sorts.mySortc(recive_sort(input));
				}
				else if(texto.equals("decrescente"))
				{
					clear();
					arr2 = sorts.mySortd(recive_sort(input));
				}
				else if(texto.equals("help"))
				{
					clear();
					help();
					continue;
				}
				else {
					clear();
					continue;
				}
				
				System.out.println("Sua sequencia ajustada:");
				for(int i : arr2)
				{
					System.out.print(i + ", ");
				}
				System.out.println();
			}
			input.close();
		}
	}
}
