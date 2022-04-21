import java.util.Random;

public class CodingForDummies {
    public static void main(String[] args) {
        Random rand = new Random();
        String firstName = "Nhan";
        char middleName = 'T';
        String lastName = "Dang";
        String[] foodsAte = {"Tacos", "Ramen", "Oatmeal", "Wings", "Sushi", "Burger", "Banana"};
        String listOfFoodsAte = "";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        int randomInt = rand.nextInt(101);
        if (randomInt < 50) {
            System.out.println(firstName);
        } else if (randomInt >= 50) {
            System.out.println(firstName + lastName);
        }
        for (int i = 0; i < foodsAte.length; i++) {
            String food = foodsAte[i];
            listOfFoodsAte = listOfFoodsAte + food;
        }
        System.out.println(listOfFoodsAte);
    }
}
