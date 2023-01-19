public class Notebook {
    private int weight;
    private int price;
    private int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }


    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("this notebook is expensive.");
        }
    }


    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 700 && this.weight <= 1600) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year <= 2023 && this.year >= 2020) {
            System.out.println("this notebook is new.");
        }
        if (this.year <= 2020 && this.year >= 2016) {
            System.out.println("This notebook is old.");
        }
        if (this.year <= 2016 && this.year >= 2010) {
            System.out.println("this notebook is very old.");
        }
    }
    public void checkPriceAndYear() {
        if (this.price >= 500 && this.price >= 1000) {
        } else if (this.year <= 2023 && this.year < 2019) {
            System.out.println("this notebook very old but very cheap.");
        }
        if (this.price > 500 && this.price >= 1500) {
        } else if (this.year < 2023 && this.year >= 2019) {
            System.out.println("This notebook is old and price is good.");
        }
        if (this.price < 1000 && this.price >= 1500) {
        } else if (this.year <= 2023 && this.year > 2019) {
            System.out.println("This notebook is new and expensive.");
        }
    }
}