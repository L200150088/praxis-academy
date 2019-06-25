class Manusia{
    String nama;
}

class Mahasiswa extends Manusia{
    String nim;
    String jurusan;
    
    Mahasiswa(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    String resume(){
        return nim+"-"+nama+"-"+jurusan;
    }
}

class Karyawan extends Manusia{
    int nip;
    String jabatan;
}

public class Oop{
    public static void main(String[] args){
        Mahasiswa panji = new Mahasiswa("Panji Sulapandoyo","155410146","Teknik Informatika");
        System.out.println(panji.resume());
    }
}