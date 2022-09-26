package jti.polinema.ac.id.recyclerview;

public class Model {
    private String no;
    private String barang;
    private String harga;

    public Model(String no, String barang, String harga) {
        this.no = no;
        this.barang = barang;
        this.harga = harga;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
