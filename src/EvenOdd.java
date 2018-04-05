
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numbers = {5, 3, 2, 4, 1};

int count1 = 0;
int count2= 0;

for(int i = 0; i<5; i ++){
	if ((numbers[i]%2) == 0){
		count1 ++;
	}
	else
	{
		count2 ++;
	}
}

System.out.println("The number of even numbers are " + count1 + " AND" +  " " + "The numer of odd numbers are " + count2);


	}

}
