public class problem45_hashmap_implementation {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAUL_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
            public int size(){

            }
            public void put(K key,V value){
                searchInBucket();
            }
            public V get(K key){

            }
            public V remove(K key){

            }
        }
        private int n;
        private LinkedList<Node>[]buckets;
        private void initBuckets(DEFAULT_CAPACITY ){       //N capacity /size of bucket array
            buckets =new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc=key.hashcode();
            return (Math.abs(hc))%buckets.length;
            
        }
        public MyHashMap(){
            initBuckets();
        }

    }
    

    public static void main(String[] args) {

    }
}
