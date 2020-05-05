public class mahasiswa {
    String username;
    int umur;
    int no_pendfatran;
    int nilai;
    int hasil_ujian;

    void informasi_pendaftaran(){
        System.out.println("calon mahasiswa mencari info pendaftran");
    }

    void menentukan_pilihan (){
        System.out.println("calon mahasiswa menetukan pilihan kampus yang di suka");
    }

    void isi_pendaftaran(){
        System.out.println("calon mahasiswa mengisi formulir");

    }

    void ujian(){
       hasil_ujian--;
        if(nilai >60 - 100){
            hasil_ujian++;
            System.out.println("selamat anda lulus , perisapkan jadi MABA");
        } else {
            System.out.println("silahkan coba tahun depan ");
        }
    }
}
