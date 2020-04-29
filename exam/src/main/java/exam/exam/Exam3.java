
package exam.exam;

import java.util.ArrayList;

import java.util.Random;

//pseudocode 

public class Exam3 {

public static void main(String args[]) {


String[] Rice = { "white", "brown", "none", "all" };
String Meat[] = { "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "none", "all" };
String Beans[] = { "pinto", "black", "none", "all" };
String Salsa[] = { "mild", "medium", "hot", "none", "all" };
String Veggies[] = { "lettuce", "fajita", "veggies", "none", "all" };
String Cheese[] = { "yes", "no" };
String Guac[] = { "yes", "no" };
String Queso[] = { "yes", "no" };
String Sour_cream[] = { "yes", "no" };



double price = 0 ;
int size=0;
for (int i = 1; i < 26; i++) {


ArrayList<String> options = new ArrayList<>();
options.add(Rice[new Random().nextInt(Rice.length)]);
options.add(Meat[new Random().nextInt(Meat.length)]);
options.add(Beans[new Random().nextInt(Beans.length)]);
options.add(Salsa[new Random().nextInt(Salsa.length)]);
options.add(Veggies[new Random().nextInt(Veggies.length)]);
options.add(Cheese[new Random().nextInt(Cheese.length)]);
options.add(Guac[new Random().nextInt(Guac.length)]);
options.add(Queso[new Random().nextInt(Queso.length)]);
options.add(Sour_cream[new Random().nextInt(Sour_cream.length)]);


double priceT = 0 ;

double count = 0;
for (int j = 0; j < options.size() - 1; j++) {

if (!options.get(j).startsWith("no")) {
count++;
}



}
priceT = 3.00 +( count * 0.5);
System.out.println("Burrito " + i + ":" + options+ "  " +  priceT);
}

}
}


