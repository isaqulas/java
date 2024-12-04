import java.util.Scanner;

public class Main{

	//Scanner texto = new Scanner(System.in());

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

static int[] SelectionSort(int[] vetor) 
{ 
    int min, aux;
    for (int i = 0; i < vetor.length-1; i++)
    {
        min = i;
        for (int j = (i+1); j < vetor.length; j++)
        {
            if (vetor[j] < vetor[min])
            {
                min = j;
            }
        }
        if (vetor[i] != vetor[min])
        {
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
    }
	return vetor;
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



	public static void main(String[] args) {
		int arr[] = {0, 3, 5, 6, 9, 2};
		int arr2[] = SelectionSort(arr);
		for(int i : arr2){
		System.out.println(i);
		}
	}
}
