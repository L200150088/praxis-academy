public class PassPrimitiveByValue{
    public static void main(String[] args){
        int x = 3;

        //memanggil passMethod() dengan x
        //sebagai argumen
        passMethod(x);

        //mencetak x untuk melihat apakah nilai sudah 
        //berubah
        System.out.println("Setelah dilakukan pemanggilan passMethod, nilai x = "+x);
    }

    public static void passMethod(int p){
        p=10;
    }
}