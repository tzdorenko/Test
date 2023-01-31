package NewPackageHomeNone;

public class Computer {
    public static void main(String[] args) {
        int [] Computers = new int[5];
          Computers [0] = 10;
          Computers [1] = 5;
          Computers [2] = 100;
          Computers [3] = 4;
          Computers [4] = 8;
        for (int i = 0; i < Computers.length; i++) {
            System.out.println(Computers[i]);
        }
        System.out.println(Computers[2] + Computers[4]);
    }

}
