public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "istanbul";
        cities[0][1] = "Ankara";
        cities[0][2] = "İzmit";
        cities[1][0] = "İzmir";
        cities[1][1] = "Bartın";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Sinop";
        cities[2][1] = "Bolu";
        cities[2][2] = "Bursa";

        for (int i = 0 ; i<3 ; i++){

            System.out.println("------------------------------");
            for (int j=0 ; j<3 ; j++){

                System.out.println(cities[i][j]);
            }

        }
    }
}