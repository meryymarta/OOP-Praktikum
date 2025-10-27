public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang persegipanjang = new PersegiPanjang(10, 7);

        persegipanjang.displayInfo();
        System.out.println("Luas: " + persegipanjang.getLuas());
        System.out.println("Keliling: " + persegipanjang.getKeliling());
        System.out.println("----------------");
    
    
    //jika setter

    persegipanjang.setPanjang(15);
    persegipanjang.setLebar(8);
    persegipanjang.displayInfo();
    System.out.println("Luas setelah dirubah: " + persegipanjang.getLuas());
    System.out.println("Keliling setelah dirubah: " + persegipanjang.getKeliling());
}
}