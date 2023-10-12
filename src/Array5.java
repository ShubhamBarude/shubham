import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        MyArrayList obj1=new MyArrayList();
        obj1.addmyelement(20);
        obj1.addmyelement(21);
        obj1.addmyelement(23);
        System.out.println(obj1);
    }


}
class MyArrayList {
    public double[] data;
    public int nItems;

    public MyArrayList() {
        data = new double[5];
        nItems = 0; // no item added yet
    }

    public void addmyelement(double itemToAdd) {
        if (isFull()) {
            grow();
        }
        data[nItems] = itemToAdd;
        nItems++;
    }

    public boolean addmyelement(int idx, double itemToAdd) {
        if (idx < 0 || idx > nItems) {
            return false; // to indicate failure
        }

        if (isFull()) {
            grow();
        }

        for (int i = nItems - 1; i >= idx; i--) {
            data[i + 1] = data[i];
        }

        data[idx] = itemToAdd;
        nItems++;

        return true; // to indicate success
    }
    public boolean isFull() {
        if (nItems == data.length)
            return true;
        else
            return false;
    }

    public void grow() { // should not be called by outside code
        double[] temp = new double[data.length + 5]; // 5 extra items

        for (int i = 0; i < data.length; i++) { // copy all items over
            temp[i] = data[i];
        }

        data = temp; // make instance variable array refer to the bigger array
    }
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(data, 0, nItems));
    }

}