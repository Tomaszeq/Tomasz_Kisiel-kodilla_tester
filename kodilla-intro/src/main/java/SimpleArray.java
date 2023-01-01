public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[13];
        names[0] = "Dwalin";
        names[1] = "Balin";
        names[2] = "Kili";
        names[3] = "Fili";
        names[4] = "Dori";
        names[5] = "Nori";
        names[6] = "Ori";
        names[7] = "Oin";
        names[8] = "Gloin";
        names[9] = "Bifur";
        names[10] = "Bofur";
        names[11] = "Bombur";
        names[12] = "Thorin III Debowa Tarcza";
        String name = names[3];
        System.out.println(name);
        int numberOfElements = names.length;
        if (numberOfElements == 13) {
            System.out.println("moja tablica ma 13 elementów");
        }
    }
}