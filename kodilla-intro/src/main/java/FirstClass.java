public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019);
        System.out.println(notebook.getWeight() + " " + notebook.getPrice() + " " + notebook.getYear());
        notebook.checkPrice(); notebook.checkWeight(); notebook.checkYear(); notebook.checkPriceAndYear();




        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        System.out.println(heavyNotebook.getWeight() + " " + heavyNotebook.getPrice() + " " + heavyNotebook.getYear());
        heavyNotebook.checkPrice(); heavyNotebook.checkWeight(); heavyNotebook.checkYear(); heavyNotebook.checkPriceAndYear();



        Notebook oldNotebook = new Notebook(1600, 500, 2015);
        System.out.println(oldNotebook.getWeight() + " " + oldNotebook.getPrice() + " " + oldNotebook.getYear());
        oldNotebook.checkPrice(); oldNotebook.checkWeight(); oldNotebook.checkYear(); oldNotebook.checkPriceAndYear();

    }
}

