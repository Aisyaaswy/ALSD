public class SLLMain03 {
    public static void main(String[] args) {
    
    SingleLinkedList03 sll = new SingleLinkedList03();
    Mahasiswa03 mhs1 = new Mahasiswa03("Alvaro", "24212200", "1A", 4.0);
    Mahasiswa03 mhs2 = new Mahasiswa03("Bimon", "23212201", "2B", 3.8);
    Mahasiswa03 mhs3 = new Mahasiswa03("Cintia", "22212202", "3C", 3.5);
    Mahasiswa03 mhs4 = new Mahasiswa03("Dirga", "21212203", "4D", 3.6);

    sll.print();
    sll.addFirst(mhs4);
    sll.print();
    sll.addLaST(mhs1);
    sll.print();
    sll.insertAfter("Dirga", mhs3);
    sll.insertAt(2, mhs2);
    sll.print();
    }
}
