class AmazonPrime1 {

static String hindhiMovie [] = {"Dil" , "Villian" , "Dear Zindagi" , "Aashiq" , "Queen"};

public static void viewMovie ( ) { 
for (int prime =0; prime<hindhiMovie.length ; prime++) { 
System.out.println(hindhiMovie[prime]);
}
}
public static void main(String a[]) { 
viewMovie();
System.out.println(hindhiMovie.length);
System.out.println(" The list of hindhi Movie is ");
}
}