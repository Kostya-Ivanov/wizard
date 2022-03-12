public class Wizards {
    String name;
    public static void main(String[] args) {
        Wizards[] w = new Wizards[3];
        int z = -1;
        while (z < 2) {
            z = z + 1;
            w[z] = new Wizards();
            w[z].name = "Гарри Поттер";
            if (z == 1) {
                w[z].name = "Ронн";
            }
            if (z == 2) {
                w[z].name = "Гермиона";
            }
            System.out.print(w[z].name + "-");
            System.out.println("Имя настоящего волшебника");
        }
    }
}

//добавим текст//

