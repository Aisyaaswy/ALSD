public class StackSurat03 {
    Surat03[] stack;
    int size, top;

    public StackSurat03(int size) {
        this.size = size;
        stack = new Surat03[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat03 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambahkan data surat lagi");
        }
    }

    public Surat03 pop() {
        if (!isEmpty()) {
            Surat03 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dimasukkan");
            return null;
        }
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dimasukkan");
            return null;
        }
    }

    public void cariSurat(String cari) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin yang dimasukkan");
            return;
        } else {
            boolean found = false;
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                    System.out.println("\nSurat izin yang ditemukan : " + stack[i].namaMahasiswa);
                    stack[i].cetakSurat();
                    found = true;
                }
            }
            if (!found) {
                System.out.printf("Surat dengan nama %s tidak ditemukan", cari);
            }
        }
    }
    
}