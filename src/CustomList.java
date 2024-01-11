import java.util.Iterator;

public class CustomList implements Iterable{
    private int[] array;
    public CustomList(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator iterator() {
        Iterator result = new CustomIterator(this.array);
        return result;
    }

    public void add(int value){
        int[] newArray = new int[this.array.length+1];
        for (int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = value;
        this.array = newArray;
    }

    public void shiftByIndex(int index){
        for (int i=index; i<this.array.length-1;i++){
            this.array[i] = this.array[i+1];
        }
    }

    public int pop () {
        int[] newArray = new int[this.array.length - 1];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = this.array[i];
        }
        int result = this.array[this.array.length-1];
        this.array = newArray;
        return result;
    }

    public void remove(int value){
        for (int i=0; i < this.array.length; i++){
           if (this.array[i] == value){
               shiftByIndex(i);
               pop();
               break;
           }
        }
    }

    public void removeAll(int value){
        for (int i=0; i < this.array.length; i++){
            if (this.array[i] == value){
                shiftByIndex(i);
                pop();
            }
        }
    }

    public int IndexOf (int value) {
        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}