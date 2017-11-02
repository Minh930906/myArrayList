// TODO: int -> Integer a content; implement MyList interface

import java.util.Arrays;

public class MyArrayList implements MyList {

    private int arraysize = 0;
    Integer [] data = new Integer[10];

//    adding

    @Override
    public int size() {
        return arraysize;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {
        int arraylength=data.length;
        data=new Integer[arraylength];
        arraysize=0;
    }

    public void add(Integer n) {

        if (arraysize == data.length) {
            capacityInc();
            data[arraysize] = n;
            arraysize++;
        } else {
            data[arraysize] = n;
            arraysize++;
        }


    }

    public void capacityInc(){
        int inc = data.length*2;
        Integer[] newArray =Arrays.copyOf(data, inc);
        data = new Integer[inc];
        System.arraycopy(newArray, 0, data, 0, inc);
    }

//    insert solution:i will use ararycopy to make, i will ask index where i need to insert and after index elements i will move one step

    public void add(int index, Integer num) {
        if(arraysize == data.length){
            capacityInc();
            insert(index,num);
        }else{
            insert(index,num);

        }
    }

    public void insert(int index,Integer num){
        System.arraycopy(data, 0, data, 0, index);
        System.arraycopy(data, index, data, index + 1,  arraysize-index);
        arraysize++;
        data[index] = num;
    }

//    remove

    public void remove(int index) {
        arraysize--;
        System.arraycopy(data, 0, data, 0, index);// azért index db-ot másolunk mert az index helyén álló elemet akarjuk törölni de az index-ik helyen lévőt nem akarjuk átmásolni
        System.arraycopy(data, index + 1, data, index, arraysize - index );
    }

    @Override
    public void remove(Integer element) {

    }

    @Override
    public String toString() {
        Integer a []=new Integer[arraysize];
       for (int i=0;i<arraysize;i++)
        {
           a[i]=data[i];
        }
        return "MyArrayList{" +
                "data=" +Arrays.toString(a) +
                '}';
    }

    public Integer[] getData() {
        return data;
    }

    //get the i index element
    public Integer get(int i) throws Exception {
        if (i>=arraysize){
            throw new IllegalArgumentException("The index is bigger than the Arraysize");
        }else {
            return data[i];
        }


    }

    public int getArraysize(){
        return arraysize;
    }

    @Override
    public void set(int index, Integer element)throws Exception {
        if (index>=arraysize){
            throw new IllegalArgumentException("The index is bigger than the Arraysize");
        }else {
            data[index]=element;
        }
    }


}
