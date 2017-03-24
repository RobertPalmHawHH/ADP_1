package data;

public class Element {

    private Element nextElement;
    private Element prevElement;


    public Element getNextElement() {
	return nextElement;
    }

    public void setNextElement(Element nextElement) {
	this.nextElement = nextElement;
    }

    public Element getPrevElement() {
	return prevElement;
    }

    public void setPrevElement(Element previousElement) {
	this.prevElement = previousElement;
    }

}
