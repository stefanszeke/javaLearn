public class StaticVar {
    
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 1);
        Fruit orange = new Fruit("Orange", 2);

        apple.displayPrice();
        orange.displayPrice();
        
        System.out.println();
        
        Fruit.setMarkup(100);
        
        System.out.println();
        
        apple.displayPrice();
        orange.displayPrice();
    }

    static class Fruit {
        private static int markup = 10;
        private int price;
        private String name;
        Fruit(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public void displayPrice() {
            System.out.println( name + " costs " + (price + markup) + " dollars." );
        }

        public static void setMarkup(int newMarkup) {
            System.out.println("Markup changed to " + markup);
            markup = newMarkup;
        }
    }
}

