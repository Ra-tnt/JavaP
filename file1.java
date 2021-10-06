public class hello{
public static void main (String [] args){

int x = 0;
int y = 10;
String name = "Raghad";
//this should be for testing the real call should be done inside the first function "myFunc"
System.out.Println(check(name));


}

public static void myFunc(String name){
	
	if(check(name)==true)
	System.out.println(name);

	else
		System.out.println("the name is not like what we expected");
}
}

public static boolean check(String name){

	boolean x = true;
	if (name.equals("Roody")
		x = false;

	return x;
}
