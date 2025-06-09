public class DoubleLinkedLists {
    Node03 head;
    Node03 tail;
    private int size;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
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

        Mahasiswa03 dataYangDihapus = tail.data;;

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
}
