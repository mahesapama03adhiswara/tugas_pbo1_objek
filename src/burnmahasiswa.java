public class burnmahasiswa {
    public static void main(String[] args) {
      mahasiswa mahasiswa1 = new mahasiswa();
      mahasiswa mahasiswa2 = new mahasiswa();

       System.out.println("MAHASISWA 1");
       mahasiswa1.no_pendfatran= 18630293;
       mahasiswa1.username = "MAHESA PAMA ADHISWARA";
        mahasiswa1.umur = 18;
        mahasiswa1.hasil_ujian = 80;
        //ekesekusi mahasiswa 1
        mahasiswa1.informasi_pendaftaran();
        mahasiswa1.menentukan_pilihan();
        mahasiswa1.isi_pendaftaran();
        System.out.println(mahasiswa1.no_pendfatran);
        System.out.println(mahasiswa1.username);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.hasil_ujian);
        mahasiswa1.ujian();

        System.out.println("MAHASISWA 2");
        mahasiswa1.no_pendfatran= 18630976;
        mahasiswa1.username = "Adhiswara";
        mahasiswa1.umur = 20;
        mahasiswa1.hasil_ujian = 50;
        //ekesekusi mahasiswa 2
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
