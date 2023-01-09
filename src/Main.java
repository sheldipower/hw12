public class Main {
    public static void main(String[] args) {
        String name =  "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13,30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + "Возраст - " + ages[i]);
        }
    }
}