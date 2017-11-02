public interface MyList {
    int size();
    boolean isEmpty();
    void clear();
    void add(Integer element);
    void add(int index, Integer element);
    Integer get(int index) throws Exception;
    void set(int index, Integer element) throws Exception;
    void remove(int index);
    void remove(Integer element);

//    int indexOf(Object o);
//    boolean contains(Object o);
//    boolean remove(Object o);

}
