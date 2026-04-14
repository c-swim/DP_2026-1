package hw.ch06.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}

//
// package hw.ch06;

// public abstract class Product implements Cloneable {
//     public abstract void use(String s);

//     public Product createCopy() {
//         Product p = null;
//         try {
//             p = (Product)clone();
//         } catch (CloneNotSupportedException e) {
//             e.printStackTrace();
//         }
//         return p;
//     }
// }
