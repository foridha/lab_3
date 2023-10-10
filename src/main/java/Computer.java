public class  Computer {

    int storage;
    String printer;

    public Computer (int inputStorage, String inputPrinter){
        this.storage = inputStorage;
        this.printer = inputPrinter;

    }

//     method 1 = Display the amount of storage
       public int currentStorage(){
            return this.storage;
        }
//      method 2 = Add more storage
        public void newStorage(int storageSpace){
            setStorage(this.storage + storageSpace);
        }

//      method 3 = Use the setter 
        public String currentPrinter(){
            return this.printer;
        }
        

// getter and setter for Q.3
        public int getStorage() {
        return this.storage;
        }

        public void setStorage(int storage){
        this.storage = storage;
        }

//         getter and setter for Q.4
            public String getPrinter(){
            return this.printer;
            }
    
            public void setPrinter(String printer){
            this.printer = printer;
            }

} // last brackets
