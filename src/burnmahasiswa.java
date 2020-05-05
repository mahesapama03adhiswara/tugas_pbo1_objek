public class burnmahasiswa {
    public static void main(String[] args) {
      mahasiswa mahasiswa1 = new mahasiswa();
      mahasiswa mahasiswa2 = new mahasiswa();

       mahasiswa1.no_pendfatran= 18630293;
       mahasiswa1.username = "MAHESA PAMA ADHISWARA";
        mahasiswa1.umur = 18;
        mahasiswa1.hasil_ujian = 80;


        mahasiswa1.informasi_pendaftaran();
        mahasiswa1.menentukan_pilihan();
        mahasiswa1.isi_pendaftaran();
        System.out.println(mahasiswa1.no_pendfatran);
        System.out.println(mahasiswa1.username);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.hasil_ujian);
        mahasiswa1.ujian();





    }
}
