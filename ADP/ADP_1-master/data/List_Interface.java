package data;

import java.util.List;

public interface List_Interface {

    
    public boolean insert(Element element, int pos);
    
    public boolean delete(int pos);
    
    public boolean delete(Element element);
    
    public int find(Element element);
    
    public Element retrieve(int pos);
    
    public boolean concat(List<Element> list2);
    
    
    
}
