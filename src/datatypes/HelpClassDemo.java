package datatypes;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {

        char choise, ignore;
        Help hlpobj = new Help();

        for (;;) {
            do {
                hlpobj.showmenu();

                choise = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();

                }while (ignore != '\n');
            }while (!hlpobj.isvalid(choise));
            if (choise == 'q') break;
            System.out.println();

            hlpobj.helpon(choise);
        }

        }
    }
