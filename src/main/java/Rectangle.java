public class Rectangle{

     int length;
     int width;

// constructor

        public Rectangle(int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

// method 1 == what we want to do
    int area (){
        return this.length * this.width;
    }

// method 2 == what we want to, checks if your rectangle is actually a square (it's length and width are the same)
    boolean isRectangle(){
            return this.length == this.width;
}

} // last curly bracket



