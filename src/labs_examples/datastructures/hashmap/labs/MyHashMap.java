package labs_examples.datastructures.hashmap.labs;

public class MyHashMap<K,V> {

    private final int SIZE = 10;

    private Entry<K, V> hashTable[];

    Entry<K,V> previous;

    private int countElements = 0;


    public MyHashMap() {

        hashTable = new Entry[SIZE];
    }

    public void put(K key, V value) {

        int hash = key.hashCode() % SIZE;

        Entry<K, V> e = hashTable[hash];

        if (e == null) {

            hashTable[hash] = new Entry<>(key, value);

            countElements++;
        }

        else {

            while (e.getNext() != null) {

                if (e.getKey() == key) {

                    e.setValue(value);
                    return;
                }
                e = e.getNext();
            }
            if (e.getKey() == key) {

                e.setValue(value);
                return;
            }

            e.setNext(new Entry<K, V>(key, value));
            countElements++;

        }
        if (countElements > hashTable.length * 0.5){


            resize();
        }

    }

    private void resize() {

        Entry<K, V>[] oldTable = hashTable;

        hashTable = new Entry[oldTable.length * 3];

        for(int i = 0; i < oldTable.length; i++){

            try{

                Entry e = oldTable[i];
                put((K) e.getKey(), (V) e.getValue());

                while(e.getNext() !=null){

                    e = e.getNext();

                    put((K) e.getKey(), (V) e.getValue());
                }
            }catch (Exception e){


            }
        }
    }

    public V get(K key){

        int hash = key.hashCode() % SIZE;

        Entry<K, V> e = hashTable[hash];

        if (e == null){

            System.out.println("Sorry, element not found!");
            return null;
        }

        while (e.getNext() != null){

            if (e.getKey() == key){

                return e.getValue();
            }

            e = e.getNext();
        }
        System.out.println("Sorry, element not found!");
        return null;
    }

    public Entry<K, V> remove(K key){

        int hash = key.hashCode() % SIZE;

        Entry<K, V> e = hashTable[hash];


        if (e == null){


            System.out.println("Sorry, element not found!");
            return null;
        }

        if (e.getKey() == key){

            hashTable[hash] = e.getNext();
            e.setNext(null);
            return e;
        }

        previous = e;
        e = e.getNext();

        while(e != null){

            if(e.getKey() == key){
                previous.setNext(e.getNext());
                e.setNext(null);
                return e;
            }
        }
        System.out.println("Sorry, element not found!");
        return null;
    }

    public void clear(){

        Entry<K, V> [] tab;
        if((tab = hashTable) != null && countElements > 0){
            countElements = 0;
            for(int i = 0; i < tab.length; ++i){
                tab[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (hashTable[i] != null) {
                sb.append(i + " " + hashTable[i] + "\n");
            } else {
                sb.append(i + " " + "null" + "\n");
            }
        }

        return sb.toString();
    }









}
