public class TipeDataArray {
    public static void main(String[] args) {
        // Array adalah sekumpulan data yang memiliki tipe data yang sama

        // cara pertama
        Object[] kumpulanNumber; //deklarasi
        kumpulanNumber = new Object[3]; //inisialisasi

        // cara kedua
//        int[] kumpulanNumber2 - new int[3];

        // cara ketiga
//        int[] kumpulanNumber3 - new int[] {1, 3, 4, 5};

        // cara memasukan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "Kevin";
        kumpulanNumber[2] = 20L;

        // cara mengakses
        System.out.println(kumpulanNumber[1]);
       }
}
