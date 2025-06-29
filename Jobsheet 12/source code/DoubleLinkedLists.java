public class DoubleLinkedLists {
    Node03 head;
    Node03 tail;
    private int size;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int index, Mahasiswa03 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid. Indeks harus antara 0 sampai " + size);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node03 newNode = new Node03(data);
        Node03 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;

        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa03 data) {
        Node03 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) { 
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node03 newNode = new Node03(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih dalam kondisi kosong!");
        } 

        Node03 current = head;
        while (current != null ) {
            System.out.print("NIM : " + current.data.nim + ", Nama : " + current.data.nama + ", Kelas : " + current.data.kelas + ", IPK : " + current.data.ipk);
            current = current.next;
            if (current != null) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada data yang bisa dihapus!");
            return;
        }

        Mahasiswa03 dataYangDihapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;

        System.out.println("Data sudah berhasil dihapus.");
        System.out.println("Data yang terhapus adalah   : ");
        System.out.println("NIM : " + dataYangDihapus.nim + ", Nama : " + dataYangDihapus.nama + ", Kelas : " + dataYangDihapus.kelas + ", IPK : " + dataYangDihapus.ipk);
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada data yang bisa dihapus.");
            return;
        }

        Mahasiswa03 dataYangDihapus = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        
        System.out.println("Data sudah berhasil dihapus.");
        System.out.println("Data yang terhapus adalah   : ");
        System.out.println("NIM : " + dataYangDihapus.nim + ", Nama : " + dataYangDihapus.nama + ", Kelas : " + dataYangDihapus.kelas + ", IPK : " + dataYangDihapus.ipk);
    }

    public void removeAfter(String keyNim) {
        Node03 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
            return;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " untuk dihapus");
            return;
        }

        Node03 nodeToDelete = current.next;
        Mahasiswa03 dataYangDihapus = nodeToDelete.data;

        if (nodeToDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = nodeToDelete.next;
            nodeToDelete.next.prev = current;
        }
        size--;

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus");
        System.out.println("Data yang terhapus adalah : ");
        System.out.println("NIM : " + dataYangDihapus.nim + ", Nama : " + dataYangDihapus.nama + ", Kelas : " + dataYangDihapus.kelas + ", IPK : " + dataYangDihapus.ipk);
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa dihapus");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid. Indeks harus antara 0 sampai " + (size -1));
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size) {
            removeLast();
            return;
        }

        Node03 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Mahasiswa03  dataYangDihapus = current.data;

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;

        System.out.println("Data pada indeks " + index + " berhasil dihapus");
        System.out.println("Data yang terhapus adalah : ");
        System.out.println("NIM : " + dataYangDihapus.nim + ", Nama : " + dataYangDihapus.nama + ", Kelas : " + dataYangDihapus.kelas + ", IPK : " + dataYangDihapus.ipk);
    } 

    public Node03 search(String nim) {
        Node03 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }              
    
    public Mahasiswa03 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return null;
        }
        return head.data;
    }

    public Mahasiswa03 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa03 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong");
            return null;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid. Indeks harus antara 0 sampai " + (size -1));
            return null;
        }
        
        Node03 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }
}