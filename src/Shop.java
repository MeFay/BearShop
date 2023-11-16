public class Shop {
    int numberOfBears = 100;

    public void bearNumber(){
        for (int i = 0; i < numberOfBears; i++) {
            if (i % 2 == 0) {
                System.out.println("Simple Bear 🧸");
            } else if (i % 5 == 0) {
                System.out.println("Cranky Bear 🧸💢");
            } else {
                System.out.println("Drunk Bear 🧸🍺");
            }
        }
    }
}
