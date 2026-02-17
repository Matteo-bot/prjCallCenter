public interface List<T> {
    void addAtPosition(T element, int position) throws Exception;
    void addElement(T element);
    void removeElementAtPosition(int position) throws Exception;
    void removeElement(T element) throws Exception;
    void modifyElement(T newElement, int position);
    T readElement(int position) throws Exception;
    int count();
}
