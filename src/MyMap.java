public class MyMap<k,v> {
    final static int DEFAULT_CAPACITY = 16;
    Entry<k,v>[] list=new Entry[DEFAULT_CAPACITY];
    int size=0;
    private int hashToIndex(k key) {
        return Math.abs(hashCode() % DEFAULT_CAPACITY);
    }

    public v put(k key,v value){
        int index=hashToIndex(key);
        Entry<k,v> head=list[index];
        if (head == null) {
            list[index] = new Entry<>(key, value);
            size++;
            return value;
        }
        while(true){
            if(key.equals(head.key)){
                head.value=value;
                return value;
            }
            if(head.next==null){
                break;
            }
            head=head.next;
        }
        size++;
        head.next=new Entry<>(key,value);
        return head.next.value;
    }
    public v get(k key){
        int index=hashToIndex(key);
        Entry<k,v> head=list[index];
        while(head!=null){
            if(key.equals(head.key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public int size(){
        return size;
    }
}