package Model;

public class modelFestival {
    public String namaFestival;
    public String asal;
    public String tanggalPelaksanaan;
    
    //CONSTRUKTOR
    public modelFestival(String namaFestival, String asal, String tanggalPelaksanaan) {
        this.namaFestival = namaFestival;
        this.asal = asal;
        this.tanggalPelaksanaan = tanggalPelaksanaan;
    }
    
        @Override
    public String toString() {
        return String.format("%-30s | %-20s | %-20s", namaFestival, asal, tanggalPelaksanaan);
    }
}


