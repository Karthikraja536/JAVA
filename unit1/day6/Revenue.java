    class item {
        private String name;
        private double price;
        private static int totalItemsSold = 0;
        private static double totalRevenue = 0.0;

        public item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void sell(int quantity) {
            totalItemsSold += quantity;
            totalRevenue += quantity * price;
        }

        public static int getItemSold() {
            return totalItemsSold;
        }

        public static double getRevenue() {
            return totalRevenue;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public class Revenue {
        public static void main(String[] args) {
            item laptop = new item("Laptop", 1000.0);
            laptop.sell(2);

            System.out.println("Total Items Sold: " + item.getItemSold());
            System.out.println("Total Revenue: $" + item.getRevenue());
        }
    }
