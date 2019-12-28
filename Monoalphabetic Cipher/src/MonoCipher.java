import java.util.Scanner;

public class MonoCipher {


     static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
     static char[] key = {'x', 'y', 'z', 'w', 'v', 'u', 't', 's', 'r', 'p', 'q', 'o', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};

      static String Encrypt (String msg) {

        char rs [] = new char[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (alphabet[j] == msg.charAt(i)) {
                    rs[i] = key[j];
                }
            }
        }
            return  (new String(rs));
    }

   static String Decrypt(String msg){

        char rs [] = new char[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (key[j] == msg.charAt(i)) {
                    rs[i] = alphabet[j];
                }
            }
        }
       return new String(rs);

    }

    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message: ");
        String msg = sc.nextLine().toLowerCase();
        System.out.println("E to Encrypt , D to Decrypt");
        char choice = Character.toLowerCase(sc.nextLine().charAt(0));

        switch (choice){
            case 'e':
                System.out.println("ENCRYPTED: "+Encrypt(msg));
            break;
            case 'd':
                System.out.println("DECRYPTED: "+Decrypt(Encrypt(msg)));
            break;
            default:
                System.out.println("CHOOSE AGAIN !!!");
        }
    }
}