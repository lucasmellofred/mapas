/**
 * public class Mapa<K, V> {
 * private Node<K, V> head;
 * private int size;
 * 
 * public Mapa() {
 * this.head = null;
 * this.size = 0;
 * }
 * 
 * public void put(K key, V value) {
 * Node<K, V> newNode = new Node<>(key, value);
 * if (head == null) {
 * head = newNode;
 * } else {
 * Node<K, V> current = head;
 * while (current.getNext() != null) {
 * current = current.getNext();
 * }
 * current.setNext(newNode);
 * newNode.setPrev(current);
 * }
 * size++;
 * }
 * 
 * public V get(K key) {
 * Node<K, V> current = head;
 * while (current != null) {
 * if (current.getKey().equals(key)) {
 * return current.getValue();
 * }
 * current = current.getNext();
 * }
 * return null;
 * }
 * 
 * public int size() {
 * return size;
 * }
 * 
 * public boolean isEmpty() {
 * return size == 0;
 * }
 * 
 * private static class Node<K, V> {
 * private K key;
 * private V value;
 * private Node<K, V> prev;
 * private Node<K, V> next;
 * 
 * public Node(K key, V value) {
 * this.key = key;
 * this.value = value;
 * this.prev = null;
 * this.next = null;
 * }
 * 
 * public K getKey() {
 * return key;
 * }
 * 
 * public V getValue() {
 * return value;
 * }
 * 
 * public Node<K, V> getPrev() {
 * return prev;
 * }
 * 
 * public void setPrev(Node<K, V> prev) {
 * this.prev = prev;
 * }
 * 
 * public Node<K, V> getNext() {
 * return next;
 * }
 * 
 * public void setNext(Node<K, V> next) {
 * this.next = next;
 * }
 * }
 * }
 */

public class Mapa<K, V> {
    private Node<K, V> head;
    private int size;

    public Mapa() {
        this.head = null;
        this.size = 0;
    }

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        if (head == null) {
            head = newNode;
        } else {
            Node<K, V> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
        }
        size++;
    }

    public V get(K key) {
        Node<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> prev;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getPrev() {
            return prev;
        }

        public void setPrev(Node<K, V> prev) {
            this.prev = prev;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
}
