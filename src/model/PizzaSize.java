package model;

public enum PizzaSize {
	S,// Small
	M,// Medium
	L, //Large
	XL, //X Large
	PSD;//Personal DishSize
    @Override
    public String toString() {
        switch (this) {
            case S: return "קטן";
            case M: return "בינוני";
            case L: return "גדול";
            case XL: return "אקסרא גדול";
            case PSD: return "מנה אישית";
            default: throw new IllegalArgumentException();
        }
    }
}
