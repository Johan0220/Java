/*Johan*/
package demotest;

/**
 *
 * @author nguye
 */
public class book {
    private String title;
    author auth;
    private double price;
    
    public book(){
    }
    
    public book(String title, author auth, double price) {
        this.title = title;
        this.auth = auth;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(author auth) {
        this.auth = auth;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public author getAuth() {
        return auth;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
         return "\nBook title:"+title+"\nAuthor: "+auth.toString()+"\nPrice:"+price;
    }
    
}
