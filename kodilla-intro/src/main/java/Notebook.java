public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("this notebook is expensive.");
        }
    }


    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight <= 1600) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2018 && this.price >= 1500) {
            System.out.println("This notebook has poor value for money.");
        } if (this.year < 2018 && this.price == 1000) {
            System.out.println("This notebook has good value for money.");
        } else if (this.year < 2018 && this.price < 1000) {
            System.out.println("This notebook has average value for money.");
        }
    }
}
