public class arrays {
    public static void main(String[] args) {
        double[] list = {1.0, 5.0, 8.0, 16.0, 25.0, 36.0};
        double harmonicArray = 0.0, harmonicAvarage = 0;
        for (int i = 0; i < list.length ; i++) {
            harmonicArray += (1 / list[i]);

        }
        System.out.println("Harmonik seri : " + harmonicArray);
        harmonicAvarage = (list.length / harmonicArray);

        System.out.println("Harmonik Ortalama : " + harmonicAvarage);

    }
}
