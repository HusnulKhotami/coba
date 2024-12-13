package kuis2pbo;
import java.util.List;
import java.util.ArrayList;

public class Sekolah {
    private String nama;
    private String alamat;
    private List<Guru> daftarGuru = new ArrayList();
    private List<Siswa> daftarSiswa = new ArrayList<>();

    public Sekolah(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahGuru(Guru guru) {
        daftarGuru.add(guru);
    }

    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
    }
}

public class Guru {
    private String nama;
    private String id;
    private List<MataPelajaran> mataPelajaranList = new ArrayList<>();

    public Guru(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void mengajarMataPelajaran(MataPelajaran mataPelajaran) {
        mataPelajaranList.add(mataPelajaran);
    }
}


