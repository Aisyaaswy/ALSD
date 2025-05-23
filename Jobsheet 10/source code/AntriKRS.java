public class AntriKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int kuota = 30;

    public AntriKRS() {
        max = 10;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
              return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front + 1].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa paling akhir : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". " );
            data[index].tampilkanData();
        }
    }

    public void getJumlahAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        } else {
            System.out.println("Jumlah Antrian : " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah Mahasiswa!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa[] layaniMahasiswa() {
        Mahasiswa[] dilayani = new Mahasiswa[2];
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        if (size < 2) {
            System.out.println("Mahasiswa kurang dari 2 di dalam antrean");
            return null;
        }
        dilayani[0] = data[front];
        dilayani[1] = data[front + 1];
        front = (front + 2) % max;
        size -= 2;
        kuota -= 2;
        return dilayani;
    }

    public void getMhsBelumDiproses() {
        System.out.println("Jumlah Mahasiswa yang belum memproses KRS : " + (kuota - size));
    }

    public void getMhsSudahDiproses() {
        System.out.println("Jumlah Mahasiswa yang telah melakukan proses KRS : " + (kuota + size));
    }
}