package ArrayList;

class MyArrayList {
    public double[] data;
    public int nItems;

    public MyArrayList() {
        data = new double[5];
        nItems = 0; // no item added yet
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

    public void add(double itemToAdd) {
        if (isFull()) {
            grow();
        }
        data[nItems] = itemToAdd;
        nItems++;
    }

    public boolean add(int idx, double itemToAdd) {
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

}

