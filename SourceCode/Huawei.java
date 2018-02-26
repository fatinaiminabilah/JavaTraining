 public class HuaweiModem implements Modem {
                     public boolean open() {

                             System.out.println("Starting Modem");
                             return true;


                     }

                     public boolean close() {
                             System.out.println("Closing Modem");
                             return true;

                     }

                     public int read() {
                            System.out.println("Read");
                            return 122;


                             // implementation

                     }

                     public int write(byte[] buffer)
                            System.out.println("Write");
                            return 233;


                    }
                }

        public static void main() {
            HuaweiModem modem = new HuaweiModem();
            modem.open();
        }

                             